public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length, start = 0, end = m * n -1;
        while(start <= end){
            int middle = (start + end) / 2;
            if(matrix[middle / n][middle % n] == target)
                return true;
            if(matrix[middle / n][middle % n] > target)
                end = middle - 1;
            else
                start = middle + 1;
        }
        return false;
    }    
}