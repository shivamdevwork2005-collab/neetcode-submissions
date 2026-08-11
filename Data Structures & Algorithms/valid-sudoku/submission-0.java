class Solution {
    public boolean isValidSudoku(char[][] board) {
        // I will Try And learn it

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];

                if (ch == '.')
                    continue;

                // Row
                String row = ch + " in row " + i;

                // Column
                String col = ch + " in col " + j;

                // 3 x 3 box
                String box = ch + " in box " + (i / 3) + "-" + (j / 3);

                if (!set.add(row) || !set.add(col) || !set.add(box)) {
                    return false;
                }
            }
        }

        return true;
    }
}
