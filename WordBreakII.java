public class Solution {
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        int len = s.length();
        boolean[] divided = new boolean[len + 1];
        Arrays.fill(divided, false);
        divided[0] = true;
        ArrayList<ArrayList<Integer>> pre = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= len; i ++)
            pre.add(new ArrayList<Integer>());
        for(int i = 1; i <= len; i ++){
            for(int j = i-1; j >= 0; j --){
                if(divided[j] && dict.contains(s.substring(j,i))){
                    pre.get(i).add(j);
                    divided[i] = true; 
                }
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        dfs(s, pre, len, result, "");
        return result;
    }
    
    public void dfs(String s, ArrayList<ArrayList<Integer>> pre, int end, ArrayList<String> result, String curr){
        if(end == 0){
            result.add(curr);
            return ;
        }
        ArrayList<Integer> divide = pre.get(end);
        for(int i = 0; i < divide.size(); i ++){
            int pos = divide.get(i);
            String ss = s.substring(pos, end);
            if(!curr.equals(""))
                ss = ss + " " + curr;
            dfs(s, pre, pos, result, ss);
        }
    }
}