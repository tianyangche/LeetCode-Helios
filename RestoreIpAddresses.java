public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> result = new ArrayList<String>();
        String curr = "";
        dfs(s, 0, 0, curr, result);
        return result;
    }
    public void dfs(String s, int pos, int start , String curr, ArrayList<String> result){
        if(start == 4){
            if(pos == s.length())
                result.add(curr.substring(0, curr.length() - 1));
            return ;
        }
        int n = s.length();
        if( n - pos >3*(4-start) || n-pos < 4-start)
            return ;
        for(int i = 1; i <= Math.min(3, n - pos) ; i ++){
            String temp = s.substring(pos, pos + i);
            if(Integer.parseInt(temp) == 0){
                curr = curr + temp+".";
                dfs(s, pos + i, start + 1, curr, result);
                return;
            }
            if(Integer.parseInt(temp) > 255)
                return;
            dfs(s, pos + i, start + 1, curr + temp + ".", result);
        }
    }
}  