public class Solution {
    public String getPermutation(int n, int k) {
        if(n == 0)
            return "";
        int[] factorial = new int[n+1];
        factorial[0] = 1;
        for(int i = 1; i <= n; i ++)
            factorial[i] = i * factorial[i-1];
        k = k-1;
        StringBuffer result = new StringBuffer();
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < n; i ++)
            num.add(i+1);
        for(int i = n; i > 0; i --){
            int m = k / factorial[i-1];
            result.append(num.get(m));
            num.remove(m);
            k %= factorial[i-1];
        }
        return new String(result);
        
        
    }
}