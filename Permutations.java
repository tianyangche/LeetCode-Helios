public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        int n = num.length;
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> curr = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> next = new ArrayList<ArrayList<Integer>>();
        curr.add(new ArrayList<Integer>());
        if( n == 0)
            return curr;
        for(int i = 0; i < n; i ++){
            int number = num[i];
            for(int j = 0; j < curr.size(); j ++){
                ArrayList<Integer> currList = curr.get(j);
                for(int k = 0; k <= currList.size(); k ++){
                    ArrayList<Integer> temp = new ArrayList<Integer>(currList);
                    temp.add(k, number);
                    next.add(new ArrayList<Integer>(temp));
                }
            }
            curr.clear();
            curr.addAll(next);
            next.clear();
        }
        return curr;
    }
}



public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        int n = num.length;
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        if( n == 0)
            return result;
        dfs(num, 0, curr, result);
        return result;
    }
    
    public void dfs(int[] num, int pos, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(pos == num.length){
            result.add(new ArrayList<Integer>(curr));
            return ;
        }
        int n = curr.size(), number = num[pos];
        for(int i = 0; i <= curr.size(); i ++){
            ArrayList<Integer> temp = new ArrayList<Integer>(curr);
            temp.add(i, number);
            dfs(num, pos + 1, temp, result);
        }
    }
}