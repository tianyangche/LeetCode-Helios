public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;
        helper(A, target,0, A.length - 1, result);
        if(result[0] == Integer.MAX_VALUE)
            Arrays.fill(result, -1);
        return result;
    }
    public void helper(int[] A, int target, int start, int end, int[] result){
        if(start > end)
            return;
        int middle = (start + end)/2;
        if(A[middle] == target){
            result[0] = Math.min(result[0], middle);
            result[1] = Math.max(result[1], middle);
        }
        helper(A, target, start, middle - 1, result);
        helper(A, target, middle + 1, end, result);
    }
}