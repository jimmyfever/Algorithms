import java.util.*;
public class SpiralMatrix54 {
	
	

	public static void main(String[] args){
		
	}	
	public List<Integer> spiral(int[][] matrix){
		List<Integer> res = new ArrayList<>();
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return res;
		}

		int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;

		while(left <= right && top <= bottom){
			for(int col = left; col <= right; col++){
				res.add(matrix[top][col]);
			}
			top++;

			for(int row = top; row <= bottom; row++){
				res.add(matrix[row][right]);
			}
			right--;

			for(int col = right; top <= bottom && col >= left; col--){
				res.add(matrix[bottom][col]);
			}
			bottom--;

			for(int row = bottom; left <= right && row >= top; row--){
				res.add(matrix[row][left]);
			}
			left++;
		}
		return res;
	}
}