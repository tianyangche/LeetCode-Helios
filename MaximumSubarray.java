public class Solution {
    public int maxSubArray(int[] A) {
        int prev = A[0], max = A[0];
        for(int i = 1; i < A.length; i ++){
            if(prev > 0)
                prev += A[i];
            else
                prev = A[i];
            max = Math.max(prev, max);
        }
        return max;
    }
}