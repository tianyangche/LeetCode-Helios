public class Solution {
    public int pos = Integer.MAX_VALUE;
    public int searchInsert(int[] A, int target) {
        helper(A, 0, A.length - 1, target);
        if(pos == Integer.MAX_VALUE)
            return A.length;
        return pos;
    }
    
    public void helper(int[] A, int start, int end,int target){
        if(start > end)
            return ;
        int middle = (start + end)/2;
        if(target <= A[middle])
            pos = Math.min(pos, middle);
        helper(A, start, middle - 1, target);
        helper(A, middle + 1, end, target);
    }
    
}