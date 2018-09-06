
public class GameOfLife289 {
	
	

	public static void main(String[] args){
		
	}
	/*
	To solve it in place, we use 2 bits to store 2 states:

	[2nd bit, 1st bit] = [next state, current state]

	- 00  dead (next) <- dead (current)
	- 01  dead (next) <- live (current)  
	- 10  live (next) <- dead (current)  
	- 11  live (next) <- live (current) 
	
	To get the current state, simply do

	board[i][j] & 1
	To get the next state, simply do

	board[i][j] >> 1
	*/
	public void gameOfLife(int[][] board){
		if(board == null || board.length == 0 || board[0].length == 0){
			return;
		}
		int m = board.length, n = board[0].length;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				int lives = liveNeighbors(board, m, n, i, j);
				if(board[i][j] == 1 && lives >= 2 && lives <= 3){
					board[i][j] = 3;
				}
				if(board[i][j] == 0 && lives == 3){
					board[i][j] = 2;
				}
			}
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				board[i][j] >>= 1;
			}
		}
	}	
	private int liveNeighbors(int[][] board, int m, int n, int i, int j){
		int lives = 0;
		for(int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++){
			for(int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++){
				lives += board[x][y] & 1;
			}
		}
		lives -= board[i][j] & 1;
		return lives;
	}
}