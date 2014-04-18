public class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.equals(""))
            return true;
        if(board.length == 0 || board[0].length == 0 || board.length * board[0].length < word.length())
            return false;
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(boolean[] row : visited)
            Arrays.fill(row, false);
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){

                if(dfs(board, word, i, j, 0,visited))
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int row, int col, int curr, boolean[][] visited){
        if(curr == word.length())
            return true;
        int m = board.length, n = board[0].length;
        if(row < 0 || col < 0 || row >= m || col >= n || board[row][col] != word.charAt(curr) || visited[row][col] )
            return false;
        visited[row][col] = true;
        boolean result = dfs(board, word, row +1, col, curr + 1, visited) ||
                dfs(board, word, row , col+1, curr + 1, visited) ||
                dfs(board, word, row -1, col, curr + 1, visited) ||
                dfs(board, word, row , col-1, curr + 1, visited);
        visited[row][col] = false;
        return result;
        
    }
}