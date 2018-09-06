import java.util.*;
public class PalindromePartitioning131 {
	
	

	public static void main(String[] args){
		
	}	
	public List<List<String>> partition(String s){
		List<List<String>> res = new ArrayList<>();
		if(s == null || s.length() == 0) return res;

		List<String> partition = new ArrayList<String>();
		helper(s, 0, partition, res);
		return res;
	}
	private boolean isPalindrome(String s){
		for(int i = 0, j = s.length() - 1; i < j; i++, j--){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		return true;
	}
	private void helper(String s, int startIndex, List<String> partition, List<List<String>> res){
		if(startIndex == s.length()){
			res.add(new ArrayList<String>(partition));
			return;
		}
		for(int i = startIndex; i < s.length(); i++){
			String sub = s.substring(startIndex, i + 1);
			if(!isPalindrome(sub)){
				continue;
			}
			partition.add(sub);
			helper(s, i + 1, partition, res);
			partition.remove(partition.size() - 1);
		}
	}
}