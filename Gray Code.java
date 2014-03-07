public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        int listLength;
        int currentHighest;
        for(int codeLength = 1; codeLength <=n; codeLength ++){
            listLength = result.size();
            currentHighest = 1 << (codeLength-1);
            for(int lengthIndex = listLength - 1; lengthIndex >= 0 ;lengthIndex --){
                result.add(result.get(lengthIndex) | currentHighest);
            }
        }
        return result;
    }
}