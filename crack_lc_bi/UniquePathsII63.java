
public class UniquePathsII63 {
	
	

	public static void main(String[] args){
		
	}
	public int uniquePahtsII(int[][] obstacleGrid){
		if(obstacleGrid.length == 0) return 0;

		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;

		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(obstacleGrid[i][j] == 1){
					obstacleGrid[i][j] = 0;
				}else if(i == 0 && j == 0){
					obstacleGrid[i][j] = 1;
				}else if(i == 0){
					obstacleGrid[i][j] = obstacleGrid[i][j-1] * 1;
				}else if(j == 0){
					obstacleGrid[i][j] = obstacleGrid[i-1][j] * 1;
				}else{
					obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
				}
			}
		}
		return obstacleGrid[row-1][col-1];
	}	
}