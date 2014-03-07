public class Solution {
    public String getPermutation(int n, int k) {
        int[] factor = new int[n+1];
        factor[0] = 1;
        for(int i = 1; i <= n; i ++)
            factor[i] = factor[i-1]*i;
        StringBuffer result = new StringBuffer();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 1; i <= n; i ++)
            temp.add(i);
        
        
        
        int remain = k-1;
        int curr = 0;
        for(int i = n; i >= 1; i --){
            curr = remain  / factor[i-1] ;
            result.append(temp.get(curr) );
            temp.remove(curr);
            remain %= factor[i-1];
        }
        
        return result.toString();
            
            
    }
}