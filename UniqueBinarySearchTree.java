public class Solution {
    public int numTrees(int n) {
        if(n < 2)
            return 1;
        int[] num = new int[n+1];
        Arrays.fill(num, 0);
        num[0] = 1;
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= i; j ++)
                num[i] += num[j-1]*num[i-j];
        }
        return num[n];
    }
}