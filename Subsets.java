public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        result.add(new ArrayList<Integer>());
        for(int i = 0; i < S.length; i ++){
            int n = result.size();
            for(int j = 0; j < n; j ++){
                ArrayList<Integer> temp = new ArrayList<Integer>(result.get(j));
                temp.add(S[i]);
                result.add(temp);
            }
        }
        return result;
    }
}


public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        ArrayList<Integer> curr = new ArrayList<>();
        dfs(S, 0, curr,result);
        return result;
    }
    public void dfs(int[] S, int pos, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(pos == S.length){
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        
        curr.add(S[pos]);
        dfs(S, pos + 1, curr, result);
        curr.remove(curr.size()-1);
        dfs(S, pos + 1, curr, result);
    }
    
}