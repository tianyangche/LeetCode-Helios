public class Solution {
    public void sortColors(int[] A) {
        if(A.length < 2)
            return ;
        int zero = 0, one = 0, two = A.length - 1;
        while(one <= two){
            if(A[one] == 0){
                swap(A, zero, one);
                zero ++ ;
                one ++;
            } else if(A[one] == 2){
                swap(A, one, two);
                two --;
            } else
                one ++;
        }
    }
    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
}