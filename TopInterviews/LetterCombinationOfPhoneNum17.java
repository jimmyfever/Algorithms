import java.util.*;
public class LetterCombinationOfPhoneNum17 {
	
	

	public static void main(String[] args){
		
	}
	public List<String> letterCombin(String digits){
		String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		List<String> ans = new ArrayList<>();

		if(digits.length() == 0){
			return ans;
		}
		dfs(0, digits.length(), "", digits, phone, ans);
		return ans;
	}
	private void dfs(int start, int end, String s, String digits, String[] phone, List<String> ans){
		if(start == end){
			ans.add(s);
			return;
		}
		int d = digits.charAt(start) - '0';
		for(char c : phone[d].toCharArray()){
			dfs(start + 1, end, s + c, digits, phone, ans);
		}
	}	
}