import java.util.*;
public class LIS300 {
	
	public int lengthOfLIS(int[] nums){
		if(nums.length == 0) return 0;

		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		for(int i = 1; i < nums.length; i++){
			for(int j = 0; j < i; j++){
				if(nums[j] < nums[i]){
					dp[i] = Math.max(dp[i], 1 + dp[j]);
				}
			}
		}
		int res = 1;
		for(int i = 0; i < nums.length; i++){
			res = Math.max(res, dp[i]);
		}
		return res;
	}
}