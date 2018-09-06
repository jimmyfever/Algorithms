
public class IntegerBreak343 {
	
	private int[] memo;

	public static void main(String[] args){
		
	}
	public int intgerBreak(int n){
		memo = new int[n+1];
		return dp(n);
	}	
	private int dp(int n){
		if(n == 1) return 1;

		if(memo[n] != 0) return memo[n];

		int res = -1;
		for(int i = 1; i <= n-1; i++){
			res = max3(res, i * dp(n-i), i*(n-i));
		}
		memo[n] = res;
		return res;
	}
	private int max3(int a, int b, int c){
		return Math.max(a, Math.max(b, c));
	}
}