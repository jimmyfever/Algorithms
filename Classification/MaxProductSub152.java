
public class MaxProductSub152 {
	
	

	public static void main(String[] args){
		int[] n = {-1, 2};
		System.out.println(maxProduct(n));
	}	
	public static int maxProduct(int[] nums){
		if(nums == null || nums.length == 0) return 0;

		int res = nums[0], curMin = nums[0], curMax = nums[0];
		for(int i = 1; i < nums.length; i++){
			if(nums[i] < 0){
				int tmp = curMax;
				curMax = curMin;
				curMin = tmp;
			}

			curMax = Math.max(nums[i], curMax * nums[i]);
			curMin = Math.min(nums[i], curMin * nums[i]);

			res = Math.max(res, curMax);
		}
		return res;
	}
}