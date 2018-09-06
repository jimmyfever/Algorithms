import java.util.*;
public class PartitionEqualSubsetSum416 {
	
	private int[][] dp;
	public boolean canPartition(int[] nums){
		int sum = 0;
		int len = nums.length;
		for(int i = 0; i < len; i++){
			sum += nums[i];
		}

		if(sum%2 != 0) return false;

		dp = new int[len][sum/2+1];
		for(int row = 0; row < len; row++){
			Arrays.fill(dp[row], -1);
		}

		return helper(nums, len - 1, sum/2);
	}
	private boolean helper(int[] nums, int index, int sum){
		if(sum == 0) return true;

		if(sum < 0 || index < 0) return false;

		if(dp[index][sum] == -1){
		 dp[index][sum] = (helper(nums, index-1, sum) || 
			helper(nums, index-1, sum-nums[index])) ? 1 : 0;
		}
		return dp[index][sum] == 1;
	}
}