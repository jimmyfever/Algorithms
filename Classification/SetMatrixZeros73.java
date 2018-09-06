
public class SetMatrixZeros73 {
	
	

	public static void main(String[] args){
		
	}
	public void setZeros(int[][] matrix){
		if(matrix == null || matrix.length == 0) return;

		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean fr = false;
		boolean fc = false;

		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(matrix[i][j] == 0){
					if(i == 0) fr = true;
					if(j == 0) fc = true;
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for(int i = 1; i < rows; i++){
			for(int j = 1; j < cols; j++){
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] =0;
				}
			}
		}
		if(fr){
			for(int j = 0; j < cols; j++){
				matrix[0][j] = 0;
			}
		}
		if(fc){
			for(int i = 0; i < rows; i++){
				matrix[i][0] = 0;
			}
		}
	}	
}