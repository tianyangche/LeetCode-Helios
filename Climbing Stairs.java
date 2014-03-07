public class Solution {
    public int climbStairs(int n) {
        if(n == 0)
            return 0;
        int prev = 0;
        int curr = 1;
        for(int i = 1; i <= n; i ++){
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }
}