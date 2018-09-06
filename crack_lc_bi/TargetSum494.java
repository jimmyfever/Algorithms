
public class TargetSum494 {
	
	public int findTargetSumWays(int[] nums, int S){

		int sum = 0;
		for(int i : nums){
			sum += i;
		}

		if(sum < Math.abs(S)) return 0;
		/*
		                  sum(P) - sum(N) = target
sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
                       2 * sum(P) = target + sum(nums)
		*/
		return (S+sum)%2 > 0 ? 0 : helper(nums, (S+sum)/2);

	}
	private int helper(int[] nums, int s){
		int[] dp = new int[s+1];
		dp[0] = 1;
		for(int n : nums){
			for(int i = s; i >= n; i--){
				dp[i] += dp[i-n];
			}
		}
		return dp[s];
	}
}