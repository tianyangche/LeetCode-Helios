public class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int n = matrix.length;
        for(int i = 0; i <= (matrix.length - 1)/2; i ++ ){
            for(int j = 0; j < matrix.length /2; j++ ){
                temp = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}