
public class NumberOfIslands200 {
	
	

	public static void main(String[] args){
		
	}	
	public int numIsLands(char[][] grid){
		if(grid.length == 0) return 0;
		if(grid[0].length == 0) return 0;

		int ans = 0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] != '1'){
					dfs(grid, i, j);
					ans++;
				}
			}
		}
		return ans;
	}
	private void dfs(char[][] grid, int i, int j){
		if(i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1'){
			grid[i][j] = '#';
			dfs(grid, i - 1, j);
			dfs(grid, i + 1, j);
			dfs(grid, i, j - 1);
			dfs(grid, i, j + 1);
		}
	}
}