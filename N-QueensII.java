public class Solution {
    private int totalNumber = 0;
    public int totalNQueens(int n) {
        ArrayList<String[]> result = new ArrayList<String[]>();
        int[] place = new int[n];
        Arrays.fill(place,-1);
        dfs(place, 0);
        return totalNumber;
    }
    
    public void dfs(int[] place, int start){
        int n = place.length;
        if(start == n){
            totalNumber ++;
            return ;
        }
        for(int i = 0; i < n; i ++){
            place[start] = i;
            if(!isValid(place,start))
                continue;
            dfs(place, start +1);
        }
    }
    
    public boolean isValid(int[] place,int end){
        int n = place.length;
        for(int i = 0; i < end; i ++)
            if(place[end] == place[i] || Math.abs(place[end] - place[i]) == end - i)
                return false;
        return true;
    }
    

}