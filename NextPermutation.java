public class Solution {
    public void nextPermutation(int[] num) {
        if(num.length == 1)
            return;
        boolean flag = false;
        for(int i = num.length - 2; i >= 0; i -- ){
            if(num[i+1] > num[i] ){
                for(int j = num.length - 1; j > i; j --){
                    if(num[j] > num[i]){
                        int temp = num[j];
                        num[j] = num[i];
                        num[i] = temp;
                        
                        for(int k = i + 1; k <= (num.length + i )/2; k ++ ){
                            temp = num[k];
                            num[k] = num[num.length + i - k];
                            num[num.length + i - k] = temp;
                        }
                        flag = true;
                        break;
                        
                    }
                }
            }
            if(flag)
                break;
        }
        
        if(!flag){
            for(int k = 0; k <= (num.length - 1)/2; k ++ ){
                int temp = num[k];
                num[k] = num[num.length -1 - k];
                num[num.length -1 - k] = temp;
            }
        }
    }
}