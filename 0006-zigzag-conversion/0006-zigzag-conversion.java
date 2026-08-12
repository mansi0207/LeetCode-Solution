class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows){
            return s;
        }
        char[][] arr = new char[numRows][s.length()];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = ' '; 
            }
        }

        int row = 0, col = 0;
        boolean Down = true;

        for (int i = 0; i < s.length(); i++) {
            arr[row][col] = s.charAt(i);

            if (Down) {
                if (row == numRows - 1) {
                    Down = false;
                    row--;
                    col++;
                } else {
                    row++;
                }
            } else {
                if (row == 0) {
                    Down = true;
                    row++;
                } else {
                    row--;
                    col++;
                }
            }
        }

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr[i][j] != ' ') {
                    sb.append(arr[i][j]);
                }
            }
        }
        return sb.toString();

        
    }
}