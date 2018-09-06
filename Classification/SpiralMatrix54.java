import java.util.*;
public class SpiralMatrix54 {
	
	

	public static void main(String[] args){
		int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(spiral(m));
	}
	public static List<Integer> spiral(int[][] matrix){
		List<Integer> list = new ArrayList<>();
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
		
		int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;

		while(left <= right && top <= bottom){
			for(int i = left; i <=right; i++){
				list.add(matrix[top][i]);
			}
			top++;
			for(int i = top; i <= bottom; i++){
				list.add(matrix[i][right]);
			}
			right--;
			for(int i = right; top <= bottom && i >= left; i--){
				list.add(matrix[bottom][i]);
			}
			bottom--;
			for(int i = bottom; left <= right && i >= top; i--){
				list.add(matrix[i][left]);
			}
			left++;
		}
		return list;
	}	
}