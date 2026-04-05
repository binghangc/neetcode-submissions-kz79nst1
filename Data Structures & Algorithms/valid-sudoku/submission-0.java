class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int k = 0; k < 9; k++) {
            for (int p = 0; p < 9; p++) {
                char c = board[k][p];

                if (c == '.') continue;

                if (!rows[k].add(c)) return false;

                if (!cols[p].add(c)) return false;

                int boxIndex = (k / 3) * 3 + (p / 3);
                if (!boxes[boxIndex].add(c)) return false;
            }
        }
        return true;
    }
}
