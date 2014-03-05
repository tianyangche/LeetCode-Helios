public class Solution {
    public int threeSumClosest(int[] num, int target) {
        
        int result = Integer.MAX_VALUE;
        int a,b,c;
        Arrays.sort(num);
        for(a = 0; a < num.length-2; a++){
            b = a + 1;
            c = num.length-1;
            int temp;
            while(b < c){
                temp = num[a]+num[b]+num[c] - target;
                if(Math.abs(temp) <= Math.abs( result - target)  ){
                    result = temp + target;
                    b ++ ;
                }
                else if(temp < 0 )
                    b++;
                else if(temp > 0 )
                    c--;
            }
        }
        return result;
        
    }
}