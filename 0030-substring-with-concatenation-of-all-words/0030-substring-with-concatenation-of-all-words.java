// LeetCode 30 - Substring with Concatenation of All Words

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s.length() == 0 || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen) {
            return result;
        }

        Map<String, Integer> target = new HashMap<>();

        for (String word : words) {
            target.put(word, target.getOrDefault(word, 0) + 1);
        }

        for (int offset = 0; offset < wordLen; offset++) {
            int left = offset;
            int right = offset;
            int count = 0;

            Map<String, Integer> window = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (!target.containsKey(word)) {
                    window.clear();
                    count = 0;
                    left = right;
                    continue;
                }

                window.put(word, window.getOrDefault(word, 0) + 1);
                count++;

                while (window.get(word) > target.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);
                    window.put(leftWord, window.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }

                if (count == wordCount) {
                    result.add(left);

                    String leftWord = s.substring(left, left + wordLen);
                    window.put(leftWord, window.get(leftWord) - 1);
                    left += wordLen;
                    count--;
                }
            }
        }

        return result;
    }
}