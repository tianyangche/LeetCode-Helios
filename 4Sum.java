    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
       ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
       if(num.length < 4)
        return result;
       Arrays.sort(num);
       int a,b,c,d;
       
       
       for(a = 0; a < num.length-3; a ++){
           for(b = a + 1; b < num.length-2; b ++) {
                c = b+1;
                d = num.length - 1;
                while(c < d){
                if(num[a] + num[b] + num[c] + num[d] < target)
                        c ++;
                else if(num[a] + num[b] + num[c] + num[d] > target)
                        d --;
                else {
                       ArrayList<Integer> tempResult = new ArrayList<Integer>();
                        tempResult.add(num[a]);
                       tempResult.add(num[b]);
                       tempResult.add(num[c]);
                       tempResult.add(num[d]);
                       result.add(tempResult);
                       c ++;
                       d --;
                }
                }
            }   
        
        }
       
       
       Set<ArrayList<Integer>> s = new HashSet(result);
       result.clear();
       result.addAll(s);
       
       return result;
               
    }
}