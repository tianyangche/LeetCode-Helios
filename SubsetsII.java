public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curr = new ArrayList<Integer>();
        Arrays.sort(num);
        dfs(num, 0, curr, result);
        return result;
    }
    public void dfs(int[] num, int pos, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> result){
        if(pos == num.length){
            result.add(new ArrayList<Integer>(curr));
            return ;
        }
        int posi = pos + 1;
        while(posi < num.length && num[posi] == num[pos])
            posi ++;
        for(int i = posi; i >= pos; i --){
            if(i != posi)
                curr.add(num[i]);
            dfs(num, posi, curr, result);
        }
        for(int i = pos; i < posi; i ++)
            curr.remove(curr.size()-1);
    }


}