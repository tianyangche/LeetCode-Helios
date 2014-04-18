public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<>();
        dfs(candidates, 0, 0, target, curr, result);
        return result;
    }
    public void dfs(int[] candidates, int start, int sum, int target, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(target == sum){
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        if(start == candidates.length){
            return ;
        }

        // suppose [1,2,2,2] target = 5. If we choose 2 in previous step, we don't need to select 2 once more
        int prev = Integer.MIN_VALUE;
        int n = candidates.length;
        
        for(int i = start; i < n; i ++){
            if(sum + candidates[i] > target){
                return;
            }
            if(prev == candidates[i])
                continue;
            prev = candidates[i];
            curr.add(candidates[i]);
            dfs(candidates, i+1, sum + candidates[i], target, curr,result);
            curr.remove(curr.size()-1);
        }
    }
}