import java.util.*;
public class ValidSudoku36 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean isValid(char[][] board){
		Set<String> set = new HashSet<>();
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				char cur = board[i][j];
				if(cur != '.'){
					int sub = 3*(i / 3) + (j / 3);
					if(set.contains("r" + i + cur) || set.contains("c" + j + cur) || set.contains("sub" + sub + cur)){
						return false;
					}else{
						set.add("r" + i + cur);
						set.add("c" + j + cur);
						set.add("sub" + sub + cur);
					}
				}
			}
		}
		return true;
	}
}