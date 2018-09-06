import java.util.*;
public class ThreeSum15 {
	
	

	public static void main(String[] args){
		
	}	
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();

		if(nums == null || nums.length < 3) return res;

		Arrays.sort(nums);

		for(int i = 0; i < nums.length - 2; i++){
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
				int lo = i + 1, hi = nums.length - 1, sum = -nums[i];
				while(lo < hi){
					if(nums[lo] + nums[hi] == sum){
						res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
						while(lo < hi && nums[lo] == nums[lo + 1]) lo++;
						while(lo < hi && nums[hi] == nums[hi - 1]) hi--;
						lo++; hi--;
					}else if(nums[lo] + nums[hi] < sum)lo++;
					else hi--;
				}
			} // if
		} // for
		return res;
	}
}