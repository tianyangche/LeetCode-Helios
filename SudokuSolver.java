public class Solution {
    public boolean solveSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					for (char k = '1'; k <= '9'; k++) {
						board[i][j] = k;
						if (isRowValid(board, i,j, k) && isColValid(board, i,j, k)
								&& isSquareValid(board, i, j, k)
								&& solveSudoku(board))
							return true;
						board[i][j] = '.';
					}
					return false;
				}
			}
		}
		return true;
	}

	public boolean isRowValid(char[][] board, int row,int col, char target) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == target && i != col){
				return false;
			}
		}
		return true;
	}

	public boolean isColValid(char[][] board, int row, int col, char target) {
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == target && i != row){
				return false;
			}
		}
		return true;
	}

	public boolean isSquareValid(char[][] board, int row, int col, char target) {
		for (int i = (row / 3) * 3; i < (row / 3) * 3 + 3; i++) {
			for (int j = (col / 3) * 3; j < (col / 3) * 3 + 3; j++) {
				if (board[i][j] == target && (i != row && j != col)){
					return false;
				}
					
					
			}
		}
		return true;
	}
    
    
}