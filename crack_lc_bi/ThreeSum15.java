import java.util.*;
public class ThreeSum15 {
	
	

	public static void main(String[] args){
		
	}	
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(nums);
		for(int i = 0; i < nums.length-2; i++){
			if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
				int l = i+1, r = nums.length-1, sum = -nums[i];
				while(l<r){
					if(nums[l]+nums[r] == sum){
						list.add(Arrays.asList(nums[i], nums[l], nums[r]));
						while(l < r && nums[l] == nums[l+1]) l++;
						while(l < r && nums[r] == nums[r-1]) r--;
						l++; r--;
					}else if(nums[l] + nums[r] < sum) l++;
					else r--;
				}
			}
		}
		return list;
	}
}