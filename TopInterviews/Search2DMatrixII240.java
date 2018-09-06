
public class Search2DMatrixII240 {
	
	

	public static void main(String[] args){
		
	}
	public boolean searchMatrix(int[][] matrix, int target){
		if(matrix == null || matrix.length < 1|| matrix[0].length < 1){
			return false;
		}
		// upper right
		int col = matrix[0].length - 1;
		int row = 0;
		while(col >= 0 && row <= matrix.length - 1){
			if(target == matrix[row][col]){
				return true;
			}else if(target < matrix[row][col]){
				col--;
			}else{
				row++;
			}
		}
		return false;
	}	
}