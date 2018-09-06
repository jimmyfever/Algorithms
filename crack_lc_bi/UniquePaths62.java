
public class UniquePaths62 {
	
	

	public static void main(String[] args){
		
	}
	public int uniquePaths(int m, int n){
		int[] res = new int[n];
		res[0] = 1;
		for(int i = 0; i < m; i++){
			for(int j = 1; j < n; j++){
				res[j] += res[j-1];
			}
		}
		return res[n-1];
	}	

	public int uniquePathsII(int m, int n){
		int[][] dp = new int[m][n];

		for(int i = 0; i < m; i++){
			dp[i][0] = 1;
		}
		for(int j = 0; j < n; j++){
			dp[0][j] = 1;
		}

		for(int i = 1; i < m; i++){
			for(int j = 1; j < n; j++){
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
	}
}