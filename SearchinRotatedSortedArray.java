public class Solution {
    public int search(int[] A, int target) {
        int start = 0, end = A.length;
        while(start != end){
            int middle = (start + end)/2;
            if(A[middle] == target)
                return middle;
            if(A[start] < A[middle] ){
                if(A[start] <= target && target < A[middle] )
                    end = middle;
                else
                    start = middle + 1;
            } else{
                if(A[middle] < target && target <= A[end-1])
                    start = middle+1;
                else
                    end = middle;
            }
        }
        return -1;
    }
}