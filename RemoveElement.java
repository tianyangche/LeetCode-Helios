public class Solution {
    public int removeElement(int[] A, int elem) {
        int newLength = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]!=elem)
                A[newLength++] = A[i];
        }
        return newLength;
    }
}