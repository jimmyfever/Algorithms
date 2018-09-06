
public class HouseRobber198 {
	
	

	public static void main(String[] args){
		int[] n = {2,7,9,3,1};
		System.out.println(rob(n));
	}
	public static int rob(int[] nums){
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];

		int last = 0, now = 0;
		for(int i = 0; i < nums.length; i++){
			int lastlast = last;
			last = now;
			now = Math.max(now, nums[i] + lastlast);
		}
		return now;
	}

}