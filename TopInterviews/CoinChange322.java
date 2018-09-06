import java.util.*;
public class CoinChange322 {
	
	

	public static void main(String[] args){
		
	}	
	public int coinChange(int[] coins, int amount){
		int[] dp = new int[amount + 1];
		dp[0] = 0;
		for(int i = 1; i <= amount; i++){
			dp[i] = -1;
			for(int j = 0; i < coins.length; j++){
				if(i >= coins[j] && dp[i - coins[j]] != -1){
					if(dp[i] == -1 || dp[i - coins[j]] + 1 < dp[i]){
						dp[i] = dp[i - coins[j]] + 1;
					}
				}
			}
		}
		return dp[amount];
	}
}