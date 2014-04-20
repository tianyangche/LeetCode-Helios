public class Solution {
    public void nextPermutation(int[] num) {
        int n = num.length;
        if(n < 2)
            return ;
        boolean found = false;
        
        for(int i = n - 2; i >=0 && !found; i --){
            if(num[i] < num[i+1]){
                for(int j = n - 1; j > i && !found; j --){
                    if(num[j] > num[i]){
                        swap(num, i, j);
                        reverse(num, i+1, n-1);
                        found = true;
                    }
                }
            }
        }
        if(!found)
            reverse(num, 0, n-1);
    }
    
    public void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }
    
    public void reverse(int[] num, int a, int b){
        if(a >= b)
            return ;
        while( a < b){
            swap(num, a, b);
            a ++;
            b --;
        }
    }
}