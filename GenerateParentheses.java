public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        helper(n, n, n, "", result);
        return result;
    }
    
    public void helper(int left_remain, int right_remain, int n, String s, ArrayList<String> res){
        if(left_remain==0 && right_remain == 0){
            res.add(s);
            return ;
        }
        
        if(left_remain > 0)
            helper(left_remain-1, right_remain, n, s+"(", res);
        
        if(right_remain > left_remain)
            helper(left_remain, right_remain-1, n, s+")", res);
    }
}