import java.util.*;
public class HouseRobber198 {
	
	public int rob(int[] nums){
		int n = nums.length;
		if(n == 0) return 0;

		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		dp[n-1] = nums[n-1];
		for(int i = n-2; i >= 0; i--){
			for(int j = i; j < n; j++){
				dp[i] = Math.max(dp[i], 
							nums[j] + (j+2 < n ? dp[j+2] : 0));
			} 
		}
		return dp[0];
	}
}		