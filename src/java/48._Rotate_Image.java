https://leetcode.com/problems/rotate-image/
// Algo 1 : Transpose + Reverse : O(r*c) , O(1)
// First swap with topleft-BottomRight digaonal as mirror then reverse each row.
class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }
    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    private void reflect(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n/2 ; j++) { // Note : n/2
                int y = n-j-1;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][y];
                matrix[i][y] = temp; 
            }
        }
    }
}
// Algo 2 : Rotate in groups of 4 cells : O(r*c) , O(1)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < ((n+1)/2) ; i++) { // Mistake : i < n gives wrong ans  
            for(int j = 0 ; j < (n/2) ; j++) { // Mistake : j < n gives wrong ans
                int x = n-i-1 , y = n-j-1;
                int temp = matrix[y][i];
                matrix[y][i] = matrix[x][y];
                matrix[x][y] = matrix[j][x];
                matrix[j][x] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        
    }
}