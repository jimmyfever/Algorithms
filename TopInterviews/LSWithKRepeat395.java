
public class LSWithKRepeat395 {
	
	

	public static void main(String[] args){
		
	}
	public int longestSubstring(String s, int k){
		char[] chars = s.toCharArray();
		return helper(chars, 0, s.length(), k);
	}	
	private int helper(char[] chars, int start, int end, int k){
		if(end - start < k) return 0;
		int[] count = new int[26];
		for(int i = start; i < end; i++){
			int index = chars[i] - 'a';
			count[index]++;
		}
		for(int i = 0; i < 26; i++){
			if(count[i] < k && count[i] > 0){
				for(int j = start; j < end; j++){
					if(chars[j] == i + 'a'){
						int left = helper(chars, start, j, k);
						int right = helper(chars, j + 1, end, k);
						return Math.max(left, right);
					}
				}
			}
		}
		return end - start;
	}
}