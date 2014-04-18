public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowFlag[] = new boolean[matrix.length];
        boolean columnFlag[] = new boolean[matrix[0].length];
        for(int i = 0; i <= rowFlag.length -1; i ++){
            for(int j = 0; j <= columnFlag.length - 1; j ++){
                if(matrix[i][j] == 0){
                    rowFlag[i] = true;
                    columnFlag[j] = true;
                }
            }
        }
        
        for(int i = 0; i <= rowFlag.length -1; i ++){
            if(rowFlag[i]){
                for(int j = 0 ; j <= columnFlag.length - 1; j ++)
                    matrix[i][j] = 0;
            }
        }        
        
        for(int i = 0; i <= columnFlag.length -1; i ++){
            if(columnFlag[i]){
                for(int j = 0 ; j <= rowFlag.length - 1; j ++)
                    matrix[j][i] = 0;
            }
        }            
        
        
    }
}