public class Solution {
    public void solve(char[][] board) {
        if(board.length == 0)
            return;
        Queue<Integer> row = new LinkedList<Integer>();
        Queue<Integer> col = new LinkedList<Integer>();
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i ++){
            if(board[i][0] == 'O'){
                row.offer(i);
                col.offer(0);
            }
            if(board[i][n-1] == 'O'){
                row.offer(i);
                col.offer(n-1);
            }
        }
        
        for(int i = 1; i <= n-2; i ++){
            if(board[0][i] == 'O'){
                row.offer(0);
                col.offer(i);
            }
            if(board[m-1][i] == 'O'){
                row.offer(m-1);
                col.offer(i);
            }
        }
        
        
        while(!row.isEmpty()){
            int i = row.poll();
            int j = col.poll();
            board[i][j] = 'Y';
            if(i -1 >= 0 && board[i-1][j] == 'O'){
                row.offer(i-1);
                col.offer(j);
            }
            if(i + 1 <= m - 1 && board[i+1][j] == 'O'){
                row.offer(i+1);
                col.offer(j);
            }
            if(j - 1 >= 0 && board[i][j-1] == 'O'){
                row.offer(i);
                col.offer(j-1);
            }  
            if(j + 1 <= n - 1 && board[i][j+1] == 'O'){
                row.offer(i);
                col.offer(j+1);
            }
        }
        
        
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if(board[i][j] == 'Y'){
                    board[i][j] = 'O';
                } else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }
}