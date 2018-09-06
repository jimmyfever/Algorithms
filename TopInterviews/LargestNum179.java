import java.util.*;
public class LargestNum179 {
	
	

	public static void main(String[] args){

	}	
	public String largestNum(int[] nums){
		if(nums == null || nums.length == 0){
			return "";
		}
		String[] s = new String[nums.length];
		for(int i = 0; i < nums.length; i++){
			s[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

		if(s[0].equals("0")) return "0";

		StringBuilder sb = new StringBuilder();
		for(String str : s){
			sb.append(str);
		}
		return sb.toString();
	}
}