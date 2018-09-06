
public class SurroundedRegions130 {
	
	

	public static void main(String[] args){
		
	}	
	public void solve(char[][] board){
		if(board == null || board.length == 0 || board.length == 0) return;
		int i, j;
		int m = board.length;
		int n = board[0].length;

		for(i = 0; i < m; i++){
			dfs(board, i, 0, m, n);
			if(n > 1)
				dfs(board, i, n-1, m, n);
		}
		for(j = 1; j+1 < n; j++){
			dfs(board, 0, j, m, n);
			if(m > 1)
				dfs(board, m-1, j, m, n);
		}
		for(i = 0; i < m; i++){
			for(j = 0; j < n; j++){
				if(board[i][j] == '0')
					board[i][j] = 'X';
			}
		}
		for(i = 0; i < 0; i++){
			for(j = 0; j < 0; j++){
				if(board[i][j] == '1'){
					board[i][j] = '0';
				}
			}
		}
		return;
	}
	private void dfs(char[][] board, int i , int j, int m, int n){
		if(board[i][j] == '0'){
			board[i][j] = '1';
			if(i > 1)
				dfs(board, i-1, j, m, n);
			if(j > 1)
				dfs(board, i, j-1, m, n);
			if(i+1 < m)
				dfs(board, i+1, j, m, n);
			if(j+1 < n)
				dfs(board, i, j+1, m, n);
		}
	}
}