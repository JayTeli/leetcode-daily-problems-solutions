https://leetcode.com/problems/word-search/
// Algo 1 : Backtracking : O(n * 3^n) , O(w) .. w is word length
// if no mismatch , mark cell with # , visit its neighbours using rowOffsets and colOffsets to see if word is found ,  else backtrack and return false
class Solution {
    private char[][] board;
    private int rows;
    private int cols;
    private int[] rowOffsets = {0,1,0,-1};
    private int[] colOffsets = {1,0,-1,0};
    
    public boolean exist(char[][] board, String word) {
        this.board = board; this.rows = board.length; this.cols = board[0].length;
        for(int r = 0 ; r < rows ; r++) {
            for(int c = 0 ; c < cols ; c++) {
                if(backtrack(r , c , word , 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(int r , int c , String word , int index) {
        if(index >= word.length()) return true;                     // true
        if(r < 0 || r == rows || c < 0 || c == cols) return false;  // boundaries
        if(board[r][c] != word.charAt(index))   return false;       // mismatch
        board[r][c] = '#';  // Mark path before exploring neighbours via DFS
        for(int i = 0 ; i < 4 ; i++) {
            if(backtrack(r+rowOffsets[i] , c+colOffsets[i] , word , 1+index)) {
                return true;
            }
        }
        board[r][c] = word.charAt(index);   // Backtrack i.e restore character
        return false;
    }    
}