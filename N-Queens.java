public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> result = new ArrayList<String[]>();
        int[] place = new int[n];
        Arrays.fill(place,-1);
        dfs(place, 0, result);
        return result;
    }
    
    public void dfs(int[] place, int start, ArrayList<String[]> result){
        int n = place.length;
        if(start == n){
            String[] solution = convert(place);
            result.add(solution);
            return ;
        }
        for(int i = 0; i < n; i ++){
            place[start] = i;
            if(!isValid(place,start))
                continue;
            dfs(place, start +1, result);
        }
    }
    
    public boolean isValid(int[] place,int end){
        int n = place.length;
        for(int i = 0; i < end; i ++)
            if(place[end] == place[i] || Math.abs(place[end] - place[i]) == end - i)
                return false;
        return true;
    }
    
    public String[] convert(int[] place){
        int n = place.length;
        char[][] solution = new char[n][n];
        for(int i = 0; i < n; i ++){
            Arrays.fill(solution[i],'.');
            solution[i][place[i]] = 'Q';
        }
        String[] placement = new String[n];
        for(int i = 0; i < n; i ++){
            placement[i] = String.valueOf(solution[i]);
        }
        return placement;
    }
}