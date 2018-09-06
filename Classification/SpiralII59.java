import java.util.*;
public class SpiralII59 {
	
	

	public static void main(String[] args){
		int n = 3;
		System.out.println(generateMatrix(n));
	}	
	public static int[][] generateMatrix(int n){
		int[][] matrix = new int[n][n];
		int left = 0, right = n - 1, top = 0, bottom = n - 1, num = 1;
		while(left <= right && top <= bottom){
			for(int i = left; i <= right; i++){
				matrix[top][i] = num++;
			}
			top++;
			for(int i = top; i <=bottom; i++){
				matrix[i][right] = num++;
			}
			right--;
			for(int i = right; top <= bottom && i >= left; i--){
				matrix[bottom][i] = num++;
			}
			bottom--;
			for(int i = bottom; left <= right && i >= top; i--){
				matrix[i][left] = num++;
			}
			left++;
		}
		return matrix;
	}
}