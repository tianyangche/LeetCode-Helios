public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i : numbers)
            hm.put(numbers[i], i + 1);
        
        for(int i : numbers){
            result[0] = i + 1;
            if(hm.containsKey(target - numbers[i]) && hm.get(target - numbers[i])!=result[0]){
                result[1] = hm.get(target - numbers[i]);
                return result;
            }
        }
        
        result[0]=0;
        result[1]=0;
        return result;
        
        
    }
}
