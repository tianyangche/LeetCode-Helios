public class Solution {
    public int longestConsecutive(int[] num) {
        if(num.length < 2)
            return num.length;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i = 0; i < num.length; i ++)
            map.put(num[i], false);
        int length = 0, max = 0;
        for(int i = 0; i < num.length; i ++){
            if(map.get(num[i]) ) continue;
            
            length = 1;
            
            for(int j = num[i]+1; map.containsKey(j);j++ ){
                map.put(j,true);
                length ++;
            }
            for(int j = num[i]-1; map.containsKey(j);j-- ){
                map.put(j,true);
                length ++;
            }
            max = Math.max(length, max);
        }
        return max;
    }
}