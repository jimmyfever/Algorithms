
public class MaxSubarrays53 {
	
	

	public static void main(String[] args){
		int[] n = {-2};
		System.out.println(maxSub(n));
	}
	public static int maxSub(int[] nums){
		if(nums == null || nums.length == 0) return 0;

		int cur = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++){
			if(cur < 0 && cur <= nums[i]) cur = 0;
			cur += nums[i];
			max = Math.max(max, cur);
		}
		return max;
	}	
}