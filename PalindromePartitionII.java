public class Solution {
    public int minCut(String s) {
        int n = s.length();
        if(n < 2)
            return 0;
        boolean[][] isPalindrome = new boolean[n][n];
        // result[i] : the minimum from char[0] to char[i-1]
        int[] result = new int[n+1];
        for(boolean[] row :isPalindrome)
            Arrays.fill(row,false);
        for(int i = 0; i <= n; i ++)
            result[i] = i-1;

        // i: current index s.charAt(i-1)
        // j: previous index before i. begin from i
        for(int i = 1; i <= n ; i ++){
            for(int j = i ; j >=1; j --){
                if(s.charAt(j-1) == s.charAt(i-1) &&(i - j < 2 || isPalindrome[j][i-2])){
                    result[i] = Math.min(result[j-1]+1,result[i]);
                    isPalindrome[j-1][i-1] = true;
                }
            }
        }
        return result[n];
        
    }
}