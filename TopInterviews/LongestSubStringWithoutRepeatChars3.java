import java.util.*;
public class LongestSubStringWithoutRepeatChars3 {
	
	

	public static void main(String[] args){
		String s = "abcabcbb";
		System.out.println(lengthOfLS(s));
	}
	public static int lengthOfLS(String s){
		if(s.length() == 0 || s == null) return 0;

		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		for(int left = 0, right = 0; right < s.length(); right++){
			if(map.containsKey(s.charAt(right))){
				left = Math.max(right, map.get(s.charAt(right)) + 1);
			}
			map.put(s.charAt(right), right);
			max = Math.max(max, right - left + 1);
		}
		return max;
	}	
}