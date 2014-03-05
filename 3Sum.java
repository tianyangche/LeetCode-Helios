public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
       ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
       if(num.length < 3)
        return result;
       Arrays.sort(num);
       int a,b,c;
       for(a = 0; a < num.length-2; a ++){
           b = a + 1;
           c = num.length - 1;
           while(b < c){
               if(num[a] + num[b] + num[c] < 0)
                    b ++;
               else if(num[a] + num[b] + num[c] > 0)
                    c --;
               else {
                   ArrayList<Integer> tempResult = new ArrayList<Integer>();
                   tempResult.add(num[a]);
                   tempResult.add(num[b]);
                   tempResult.add(num[c]);
                        result.add(tempResult);
                   b ++;
                   c --;
               }
                    
           }
       }
       
       
       Set<ArrayList<Integer>> s = new HashSet(result);
       result.clear();
       result.addAll(s);
       
       return result;
       
       
    }
}