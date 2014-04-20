public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        if(n < k)
            return null;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        dfs(n, 1, k, curr, result);
        return result;
    }
    public void dfs(int n, int start, int k, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(curr.size() == k){
            result.add(new ArrayList<Integer>(curr));
            return ;
        }
        if(start > n)
            return ;
        curr.add(start);
        dfs(n, start + 1, k, curr, result);
        curr.remove(curr.size()-1);
        dfs(n, start + 1, k, curr, result);
    }
}