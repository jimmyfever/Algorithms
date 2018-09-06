
public class MaxProductSubarray152 {
	
	

	public static void main(String[] args){
		
	}	
	public int maxProduct(int[] nums){
		int res = nums[0];

		for(int i = 1, max = res, min = res; i < nums.length; i++){
			if(nums[i] < 0){
				int tmp = max;
				max = min;
				min = tmp;
			}

			max = Math.max(nums[i], max * nums[i]);
			min = Math.min(nums[i], min * nums[i]);

			res = Math.max(res, max);
		}
		return res;
	}
}