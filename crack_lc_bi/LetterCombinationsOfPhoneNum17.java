import java.util.*;
public class LetterCombinationsOfPhoneNum17 {
	
	
	private static final String[] KEYS = { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
	
	public static void main(String[] args){
		
	}	
	public List<String> letterCombin(String digits){
		List<String> res = new LinkedList<>();
		
		if(digits.length() == 0) return res;

		helper("", digits, 0, res);
		return res;
	}
	private void helper(String prefix, String digits, int index, List<String> res){
		if(index >= digits.length()){
			res.add(prefix);
			return;
		}
		String letters = KEYS[(digits.charAt(index) - '0')];
		for(int i = 0; i < letters.length(); i++){
			helper(prefix+letters.charAt(i), digits, index+1, res);
		}
	}
}