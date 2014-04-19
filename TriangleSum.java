public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        if(n == 1)
            return triangle.get(0).get(0);
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i ++)
            result[n-1][i] = triangle.get(n-1).get(i);
        for(int i = n -2; i >=0; i --){
            for(int j = 0; j <=i; j ++)
                result[i][j] = Math.min(result[i + 1][j], result[i+1][j+1]) + triangle.get(i).get(j);
        }
        return result[0][0];
    }
}