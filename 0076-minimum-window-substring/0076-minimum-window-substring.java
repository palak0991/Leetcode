class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] map = new int[128];

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (map[c] > 0) count--;
            map[c]--;
            right++;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char ch = s.charAt(left);
                map[ch]++;
                if (map[ch] > 0) count++;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}