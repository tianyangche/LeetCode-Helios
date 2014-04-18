public class Solution {
    public int singleNumber(int[] A) {
        int count[] = new int[Integer.SIZE];
        for(int i = 0; i < count.length; i ++)
            count[i] = 0;
        for(int i = 0; i < A.length; i ++){
            for(int j = 0; j < Integer.SIZE; j ++){
                count[j] =  count[j] + (A[i] >> j) & 1;
                count[j] = count[j] %3;
            }
        }
        
        int result=0;
        for(int i = 0; i < count.length; i ++){
            result += count[i] << i;
        }
        return result;
        
        
        
    }
}