class Solution {
    public String convert(String s, int numRows) {

        // If there is only one row,
        // zigzag doesn't change anything.
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int direction = 1; // 1 = down, -1 = up

        for (char ch : s.toCharArray()) {

            // Put current character in current row
            rows[row].append(ch);

            // If we reach the top, move DOWN
            if (row == 0) {
                direction = 1;
            }

            // If we reach the bottom, move UP
            else if (row == numRows - 1) {
                direction = -1;
            }

            // Move to next row
            row += direction;
        }

        // Combine all rows
        StringBuilder answer = new StringBuilder();

        for (StringBuilder r : rows) {
            answer.append(r);
        }

        return answer.toString();
    }
}