
public class NumOfIslands200 {
	
	private int[][] direct = {{-1,0},{0,1},{1,0},{0,-1}};
	private int m,n;
	private boolean[][] visited;

	private boolean inArea(int x, int y){
		return x >= 0 && x < m && y >= 0 && y < n;
	}	

	public static void main(String[] args){
		
	}
	public int numIslands(char[][] grid){
		if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
		m = grid.length;
		n = grid[0].length;

		visited = new boolean[m][n];

		int res = 0;
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(grid[i][j] == '1' && !visited[i][j]){
					res++;
					dfs(grid, i, j);
				}
			}
		}
		return res;
	}	
	private void dfs(char[][] grid, int i, int j){
		visited[i][j] = true;
		for(int k = 0; k < 4; k++){
			int newI = i + direct[k][0];
			int newJ = j + direct[k][1];
			if(inArea(newI, newJ) && !visited[newI][newJ] && grid[newI][newJ] == '1'){
				dfs(grid, newI, newJ);
			}
		}
		return;
	}
}