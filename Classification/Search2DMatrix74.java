
public class Search2DMatrix74 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean searchMatrix(int[][] matrix, int target){
		int m = matrix.length;
		int n = matrix[0].length;
		if(matrix == null || m == 0 || n == 0){
			return false;
		}
		int start = 0, end = m * n - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(matrix[mid / n][mid % n] == target){
				return true;
			}else if(matrix[mid / n][mid % n] < target){
				start = mid;
			}else{
				end = mid;
			}
		}
		if(matrix[start / n][start % n] == target){
			return true;
		}
		if(matrix[end / n][end % n] == target){
			return true;
		}
		return false;
	}
}