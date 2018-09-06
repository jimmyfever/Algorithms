
public class MinSizeSubSum209 {
	
	

	public static void main(String[] args){
		
	}
	public int minSub(int s, int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int l = 0, r = -1;
		int sum = 0, len = nums.length + 1;
		while(l <= nums.length){
			if(sum < s && r+1 < nums.length){
				sum += nums[++r];
			}else{
				sum -= nums[l++];
			}

			if(sum >= s){
				len = Math.min(len, r-l+1);
			}
		}
		if(len == nums.length + 1) return 0;

		return len;
	}	
}