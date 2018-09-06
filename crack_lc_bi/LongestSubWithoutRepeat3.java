
public class LongestSubWithoutRepeat3 {
	
	

	public static void main(String[] args){
		
	}	
	public int lengthOfLS(String s){
		if(s == null || s.length() == 0) return 0;

		int[] freq = new int[256];
		int l = 0, r = -1;
		int len = 0;

		while(l < s.length()){
			if(r+1 < s.length() && freq[s.charAt(r+1) - ' '] == 0){
				freq[s.charAt(++r) - ' ']++;
			}else{
				freq[s.charAt(l++) - ' ']--;
			}

			len = Math.max(len, r-l+1);
		}
		return len;
	}
}