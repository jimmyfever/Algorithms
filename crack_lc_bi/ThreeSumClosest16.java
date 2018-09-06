import java.util.*;
public class ThreeSumClosest16 {
	
	

	public static void main(String[] args){
		
	}	
	public int threeSum(int[] nums, int target){
		Arrays.sort(nums);

		int close = nums[0]+nums[1]+nums[2];
		for(int i = 0; i < nums.length; i++){
			int l = i+1, r = nums.length-1;
			while(l<r){
				int sum = nums[i]+nums[l]+nums[r];
				if(Math.abs(sum - target)<=Math.abs(close-target)){
					close = sum;
				}
				if(sum<target)l++;
				else r--;
			}
		}
		return close;
	}
}