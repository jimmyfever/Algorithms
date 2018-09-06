
public class DecodeWays91 {
	
	

	public static void main(String[] args){
		
	}
	public int numDecodings(String s){
		if(s == null || s.length() == 0){
			return 0;
		}	

		int len = s.length();
		int[] dp = new int[len + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) != '0' ? 1 : 0; // A~Z : 1~26, so number 0 has no decode way 
		for(int i = 2; i < len; i++){
			int oneDigit = Integer.valueOf(s.substring(i - 1, i));
			int twoDigits = Integer.valueOf(s.substring(i - 2, i));
			if(oneDigit >= 1 && oneDigit <= 9){
				dp[i] += dp[i - 1];
			}
			if(twoDigits >= 10 && twoDigits <= 26){
				dp[i] += dp[i - 2];
			}
		}
		return dp[len];
	}	
}