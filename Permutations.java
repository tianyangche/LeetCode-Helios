public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        int n = num.length;
        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();
        finalResult.add(new ArrayList<Integer>());
        if(n == 0)
            return finalResult;
        for(int i = 0; i < n; i ++){
            int item = num[i];
            ArrayList<ArrayList<Integer>> tempResult = new ArrayList<ArrayList<Integer>>();
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
        
        return finalResult;
        
    }
}