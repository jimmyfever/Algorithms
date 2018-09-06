import java.util.HashMap;
import java.util.Arrays;


public class TwoSum1 {
	
	

	public static void main(String[] args){
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums, 13)));
	}
	public static int[] twoSum(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[2];
		for(int i = 0; i < nums.length; i++){
			int diff = target - nums[i];
			if(map.containsKey(diff) && map.get(diff) != i){
				res[0] = map.get(diff);
				res[1] = i;
			}
			map.put(nums[i], i);
		}
		return res;
	}	
}