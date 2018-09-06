
public class RotateImage48 {
	
	

	public static void main(String[] args){
		
	}
	public void rotate(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return;
		}

		int n = matrix.length;
		int top = 0, bottom = n - 1, left = 0, right = n - 1;

		while(n > 1){
			for(int i = 0; i < n - 1; i++){
				int tmp = matrix[top][left + i]; // tmp = top
				matrix[top][left + i] = matrix[bottom - i][left];	// top = left
				matrix[bottom - i][left] = matrix[bottom][right - i];	// left = bottom
				matrix[bottom][right - i] = matrix[top + i][right];	// bottom = right
				matrix[top + i][right] = tmp;	// right = tmp(top)
			}
			top++;
			right--;
			left++;
			bottom--;

			n -= 2;	// half length is enough.
		}
		return;
	}	
}