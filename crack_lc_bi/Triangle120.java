import java.util.*;
public class Triangle120 {
	
	

	public static void main(String[] args){
		
	}	
	public int minimumTotal(List<List<Integer>> triangle){
		int row = triangle.size();
		int col = triangle.get(row-1).size();
		int[][] dp = new int[row][col];
		dp[0][0] = triangle.get(0).get(0);
		int res = Integer.MAX_VALUE;

		for(int i = 1; i < row; i++){
			for(int j = 0; j < triangle.get(i).size(); j++){
				if(j == 0){
					dp[i][j] = dp[i-1][0] + triangle.get(i).get(j);
					continue;
				}
				if(j == triangle.get(i).size()-1){
					dp[i][j] = dp[i-1][triangle.get(i-1).size()-1] + triangle.get(i).get(j);
					continue;
				}
				dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
			}
		}
		for(int i = 0; i < col; i++){
			res = Math.min(dp[row-1][i], res);
		}
		return res;
	}
}