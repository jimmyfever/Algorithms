import java.util.*;
public class WordSearch79 {
	
	

	public static void main(String[] args){
		
	}
	public boolean exist(char[][] board, String word){
		if(board == null || board.length == 0 || board[0].length == 0){
			return false;
		}

		if(word.length() == 0){
			return true;
		}

		for(int row = 0; row < board.length; row++){
			for(int col = 0; col < board[0].length; col++){
				if(board[row][col] == word.charAt(0) && dfs(board, row, col, word, 0)){
					return true;
				} // end if
			} // end for
		} // end for
		return false;
	}	
	private boolean dfs(char[][] board, int row, int col, String word, int start){
		if(start == word.length()) return true; // exit

		if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(start)){
			return false;
		}

		board[row][col] = '#';	// marker marks visited pointers.
		boolean res = dfs(board, row - 1, col, word, start + 1) ||
					  dfs(board, row, col - 1, word, start + 1) ||
					  dfs(board, row + 1, col, word, start + 1) ||
					  dfs(board, row, col + 1, word, start + 1);
		board[row][col] = word.charAt(start);
		return res;
	}
}