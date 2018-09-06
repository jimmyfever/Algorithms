import java.util.*;
public class WordSearch79 {
	
	
	private int[][] direct = {{-1,0},{0,1},{1,0},{0,-1}};
	private int m,n;
	private boolean[][] visited;

	private boolean inArea(int x, int y){
		return x >= 0 && x < m && y >= 0 && y < n;
	}

	public static void main(String[] args){
		
	}	
	public boolean exist(char[][] board, String word){
		m = board.length;
		n = board[0].length;

		visited = new boolean[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(helper(board, word, 0, i, j)){
					return true;
				}
			}
		}
		return false;

	}
	private boolean helper(char[][] board, String word, int index, int i, int j){
		if(index == word.length() - 1){
			return board[i][j] == word.charAt(index);
		}
		if(board[i][j] == word.charAt(index) ){
			visited[i][j] = true;
			for(int k = 0; k < 4; k++){
				int newI = i + direct[k][0];
				int newJ = j + direct[k][1];
				if(inArea(newI,newJ) && !visited[newI][newJ] && 
					helper(board, word, index+1, newI, newJ)){
					return true;
				}
			}
			visited[i][j] = false;
		}
		return false;
	}
}