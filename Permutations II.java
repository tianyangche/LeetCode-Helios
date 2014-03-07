public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        int n = num.length;
        Set<ArrayList<Integer>> finalResult = new HashSet<ArrayList<Integer>>();
        finalResult.add(new ArrayList<Integer>());
        ArrayList<ArrayList<Integer>> realResult = new ArrayList<ArrayList<Integer>>();
       
        if(n == 0){
             realResult.addAll(finalResult);
            return realResult;
        }
        for(int i = 0; i < n; i ++){
            int item = num[i];
            Set<ArrayList<Integer>> tempResult = new HashSet<ArrayList<Integer>>();
            for(ArrayList<Integer> temp : finalResult){
                for(int j = 0; j <= temp.size(); j ++ ){
                    ArrayList<Integer> curr = new ArrayList<Integer>(temp);
                    curr.add(j, item);
                    tempResult.add(curr);
                }
            }
            finalResult.clear();
            finalResult.addAll(tempResult);
        }
        realResult.addAll(finalResult);
        return realResult;        
    }
}