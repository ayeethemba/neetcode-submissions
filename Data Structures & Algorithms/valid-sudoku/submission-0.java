class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> rSeen = new HashSet<>();
        Set<String> cSeen = new HashSet<>();
        Set<String> bSeen = new HashSet<>();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                int squareNum = (r / 3) * 3 + (c / 3);

                String rowKey = board[r][c] + "r" + Integer.toString(r);
                String colKey = board[r][c] + "c" + Integer.toString(c);
                String boxKey = board[r][c] + "b" + Integer.toString(squareNum);

                if (!rSeen.add(rowKey)) {
                    return false;
                }
                else {
                    rSeen.add(rowKey);
                }
                
                if (!cSeen.add(colKey)) {
                    return false;
                }
                else {
                    cSeen.add(colKey);
                }

                if (!bSeen.add(boxKey)) {
                    return false;
                }
                else {
                    bSeen.add(boxKey);
                }
         

            }
        }

        return true;
        
    }
}
