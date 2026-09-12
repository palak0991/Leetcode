class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // If duplicate, remove from the left
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(current);

            // Calculate current window length
            int currentLength = right - left + 1;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}