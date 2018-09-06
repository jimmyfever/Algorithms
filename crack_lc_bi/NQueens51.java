import java.util.*;
public class NQueens51 {
	
	public static void main(String[] args){
		
	}	
	public List<List<String>> sloveNQ(int n){
		List<List<String>> res = new ArrayList<>();
		char[][] cur = new char[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				cur[i][j] = '.';
			}
		}


		boolean[] col = new boolean[n];
		boolean[] dia1 = new boolean[2*n-1];
		boolean[] dia2 = new boolean[2*n-1];

		helper(cur, 0, n, res, col, dia1, dia2);
		return res;


	}
	private void helper(char[][] cur, int index, int n, List<List<String>> res, boolean[] col, boolean[] dia1, boolean[] dia2){
		if(index == n){
			List<String> row = new ArrayList<>();
			for(int i = 0; i < n; i++){
				row.add(String.valueOf(cur[i]));
			}
			res.add(row);
			return;
		}
		for(int j = 0; j < n; j++){
			if(col[j] || dia1[index-j+n-1] || dia2[index+j]) continue;

			col[j] = true;
			dia1[index-j+n-1] = true;
			dia2[index+j] = true;
			cur[index][j] = 'Q';
			helper(cur, index+1, n, res, col, dia1, dia2);
			cur[index][j] = '.';
			col[j] = false;
			dia1[index-j+n-1] = false;
			dia2[index+j] = false;
		}
		return;
	} 
}