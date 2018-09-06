
public class NQueensII52 {
	
	private int res = 0;

	public static void main(String[] args){
		
	}	
	public int totalNQueens(int n ){
		boolean[] col = new boolean[n];
		boolean[] dia1 = new boolean[2*n -1];
		boolean[] dia2 = new boolean[2*n -1];

		helper(n, col, dia1, dia2, 0);
		return res;
	}
	private void helper(int n , boolean[] col, boolean[] dia1, boolean[] dia2, int row){
		if(row == n){
			res++;
			return;
		}

		for(int i = 0; i < n; i++){
			if(col[i] || dia1[row-i+n-1] || dia2[row+i]) continue;
			col[i] = true;
			dia1[row-i+n-1] = true;
			dia2[row+i] = true;

			helper(n, col, dia1, dia2, row+1);

			col[i] = false;
			dia1[row-i+n-1] = false;
			dia2[row+i] = false;
		}
	}
}