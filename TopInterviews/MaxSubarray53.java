
public class MaxSubarray53 {
	
	

	public static void main(String[] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSub(nums));
	}
	public static int maxSub(int[] nums){
		int sum = 0, minSum = 0, max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
			minSum = Math.min(sum, minSum);
			max = Math.max(max, sum - minSum);

		}
		return max;
	}	
}