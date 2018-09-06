import java.util.*;
public class PacificAtlanticWaterFlow417 {
	
	int[][] direct = {{-1,0},{0,1},{1,0},{0,-1}};


	public static void main(String[] args){
		
	}	
	public List<int[]> waterFlow(int[][] matrix){
		List<int[]> res = new LinkedList<>();
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return res;
		int m = matrix.length, n = matrix[0].length;
		boolean[][] pacific = new boolean[m][n];
		boolean[][] atlantic = new boolean[m][n];

		for(int i = 0; i < m; i++){
			dfs(matrix, pacific, Integer.MIN_VALUE, i, 0);
			dfs(matrix, atlantic, Integer.MIN_VALUE, i, n-1);
		}
		for(int j = 0; j < n; j++){
			dfs(matrix, pacific, Integer.MIN_VALUE, 0, j);
			dfs(matrix, atlantic, Integer.MIN_VALUE, m-1, j);
		}
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if(pacific[i][j] && atlantic[i][j])
					res.add(new int[] {i,j});
			}
		}
		return res;
	}
	private void dfs(int[][] matrix, boolean[][] visited, int h, int i, int j){
		int m = matrix.length, n = matrix[0].length;
		if(i < 0 || i >= m || j < 0 || j >= n || matrix[i][j] < h) return;

		visited[i][j] = true;
		for(int[] d : direct){
			dfs(matrix, visited, matrix[i][j], i+d[0], j+d[1]);
		} 
	}
}