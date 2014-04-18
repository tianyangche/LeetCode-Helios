public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<>();
        dfs(candidates, 0, 0, target, curr, result);
        return result;
    }
    public void dfs(int[] candidates, int start, int sum, int target, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(target == sum){
            result.add(new ArrayList<Integer>(curr));
        }
        if(start == candidates.length){
            return ;
        }

        int n = candidates.length;
        
        for(int i = start; i < n; i ++){
            if(sum + candidates[i] > target){
                return;
            }
            curr.add(candidates[i]);
            dfs(candidates, i, sum + candidates[i], target, curr,result);
            curr.remove(curr.size()-1);
        }
    }
}