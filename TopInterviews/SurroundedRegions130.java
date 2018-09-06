import java.util.*;
public class SurroundedRegions130 {
	
	char[][] board;
	int rowN;
	int colN;
	Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args){
		
	}
	public void solve(char[][] board){
		this.board = board;
		rowN = board.length;
		if(rowN == 0) return;
		colN = board[0].length;
		if(colN == 0) return;

		// first and last col
		for(int i = 0; i < rowN; i++){
			bfs(i, 0);
			bfs(i, colN - 1);
		}
		//first and last row
		for(int j = 0; j < colN; j++){
			bfs(0, j);
			bfs(rowN - 1, j);
		}

		//change 0 to X, restore # to 0
		for(int i = 0; i < rowN; i++){
			for(int j = 0; j < colN; j++){
				if(board[i][j] == '0'){
					board[i][j] = 'X';
				}else if(board[i][j] == '#'){
					board[i][j] = '0';
				}
			} // end for
		} // end for
	}	
	private void bfs(int i, int j){
		fill(i, j);
		while(!queue.isEmpty()){
			int pos = queue.poll();
			int x = pos / colN;
			int y = pos % colN;

			fill(x - 1, y);
			fill(x + 1, y);
			fill(x, y - 1);
			fill(x, y + 1);
		}
	}

	private void fill(int i, int j){
		if(i < 0 || j < 0 || i > rowN - 1 || j > colN - 1) return;
		if(board[i][j] != '0') return;
		queue.offer(i * colN + j);
		board[i][j] = '#';
	}
}