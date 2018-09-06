import java.util.*;
public class ThreeSumClosest16 {
	
	

	public static void main(String[] args){
		
	}
	public int threeSumClosest(int[] nums, int target){
		if(nums == null || nums.length < 3) return Integer.MIN_VALUE;

		Arrays.sort(nums);
		int closest = nums[0] + nums[1] + nums[2];
		for(int i = 0; i < nums.length; i++){
			int lo = i + 1, hi = nums.length - 1;
			while(lo < hi){
				int cur = nums[i] + nums[lo] + nums[hi];
				if(Math.abs(cur - target) < Math.abs(closest - target)){
					closest = cur;
				}
				if(cur < target) lo++;
				else hi--;
			}
		}
		return closest;
	}	
}