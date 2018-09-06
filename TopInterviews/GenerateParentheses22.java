import java.util.*;
public class GenerateParentheses22 {
	
	

	public static void main(String[] args){
		
	}	
	public List<String> generate(int n){
		List<String> list = new ArrayList<>();
		dfs(list, "", 0, 0, n);
		return list;
	}
	private void dfs(List<String> list, String s, int left, int right, int n){
		if(s.length() == n * 2){
			list.add(s);
			return;
		}

		if(left < n){
			dfs(list, s + "(", left + 1, right, n);
		}
		if(right < left){
			dfs(list, s + ")", left, right + 1, n);
		}
	}
}