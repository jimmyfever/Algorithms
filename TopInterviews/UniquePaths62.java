
public class UniquePaths62 {
	
	

	public static void main(String[] args){
		
	}	
	public int uniquePaths(int m, int n){
		int[][] f = new int[m][n];
		int row, col;
		for(row = 0; row < m; row++){
			for(col = 0; col < n; col++){
				if(row == 0 || col == 0){
					f[row][col] = 1;	// bound point == 1
				}else{
					f[row][col] = f[row - 1][col] + f[row][col - 1];
				}
			}
		}
		return f[m - 1][n - 1];
	}
}