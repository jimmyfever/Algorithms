import java.util.*;
public class PalindromePartitioning131 {
	
	
	List<List<String>> res;
	List<String> cur;
	public static void main(String[] args){
		
	}	
	public List<List<String>> partition(String s){
		List<List<String>> res = new ArrayList<>();
		if(s == null || s.length() == 0){
			return res;
		}

		List<String> cur = new ArrayList<>();
		helper(s, 0, cur, res);
		return res;
	}
	private void helper(String s, int startIndex, List<String> cur, List<List<String>> res){
		if(startIndex == s.length()){
			res.add(new ArrayList<String>(cur));
			return;
		}
		for(int i = startIndex; i < s.length(); i++){
			String sub = s.substring(startIndex, i+1);
			if(!isValid(sub)){
				continue;
			}
			cur.add(sub);
			helper(s, i+1, cur, res);
			cur.remove(cur.size() - 1);
		}
	}
	private boolean isValid(String s){
		for(int i =0, j = s.length() -1; i<j; i++, j--){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		return true;
	}
}