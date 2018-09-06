
public class SetMatrixZeroes73 {
	
	

	public static void main(String[] args){
		
	}
	/*
	先扫描第一行第一列，如果有0，则将各自的flag设置为true
	然后扫描除去第一行第一列的整个数组，如果有0，则将对应的第一行和第一列的数字赋0
	再次遍历除去第一行第一列的整个数组，如果对应的第一行和第一列的数字有一个为0，则将当前值赋0
	最后根据第一行第一列的flag来更新第一行第一列
	*/
	public void setZeroes(int[][] matrix){
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
			return;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean rowHas0 = false;
		boolean colHas0 = false;

		for(int i = 0; i < cols; i++){
			if(matrix[0][i] == 0){
				rowHas0 = true;
				break;
			}
		}

		for(int i = 0; i < rows; i++){
			if(matrix[i][0] == 0){
				colHas0 = true;
				break;
			}
		}

		for(int i = 1; i < rows; i++){
			for(int j = 1; j < cols; j++){
				if(matrix[i][j] == 0){
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		for(int i = 1; i < rows; i++){
			for(int j = 1; j < cols; j++){
				if(matrix[0][j] == 0 || matrix[i][0] == 0){
					matrix[i][j] = 0;
				}
			}
		}
		if(rowHas0){
			for(int i = 0; i < cols; i++){
				matrix[0][i] = 0;
			}
		}
		if(colHas0){
			for(int i = 0; i < rows; i++){
				matrix[i][0] = 0;
			}
		}
	}	
}