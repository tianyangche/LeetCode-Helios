public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        dfs(n, n, n, "", result);
        return result;
    }
    public void dfs(int n, int left, int right, String curr, ArrayList<String> result){
        if(left > right)
            return ;
        if(left < 0 || right < 0)
            return ;
        if(left == 0 && right == 0)
            result.add(curr);
        dfs(n, left - 1, right, curr + "(", result);
        dfs(n, left, right - 1, curr + ")", result);
    }
}