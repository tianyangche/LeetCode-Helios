public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean flag[] = new boolean[9];
        for(int i = 0; i < 9; i ++){
            for(int j = 0; j < 9; j ++){
                flag[j] = false;
            }
            for(int j = 0; j < 9; j ++){
                if(!check(board[i][j], flag))
                    return false;
            }
            for(int j = 0; j < 9; j ++){
                flag[j] = false;
            }
            for(int j = 0; j < 9; j ++){
                if(!check(board[j][i], flag))
                    return false;
            }            
        }        
        
        for(int r = 0; r < 3; r ++){
            for(int c = 0; c < 3; c ++){
                for(int i = 0; i < 9; i ++)
                    flag[i] = false;
                for(int i = 0; i < 3; i ++){
                    for(int j = 0; j < 3; j ++){
                        if(!check(board[r*3 + i][c*3 + j], flag))
                            return false;
                    }
                }
            }
        }        
        return true;
        
    }
    
    public boolean check(char ch, boolean flag[]){
        if(ch == '.')
            return true;
        if(flag[ch-'1'])
            return false;
            
        flag[ch-'1'] = true;
            return true;   

    }    
    
    
    
    
}