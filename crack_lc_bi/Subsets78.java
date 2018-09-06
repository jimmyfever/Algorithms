import java.util.*;
public class Subsets78 {
	
	

	public static void main(String[] args){
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}	
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		if(nums == null || nums.length == 0) return res;

		Arrays.sort(nums);
		helper(res, new ArrayList<Integer>(), nums, 0);
		return res;
	}
	private static void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int index){
		res.add(new ArrayList<Integer>(cur));
		for(int i = index; i < nums.length; i++){
			cur.add(nums[i]);
			helper(res, cur, nums, i+1);
			cur.remove(cur.size()-1);
		}
		return;
	}
}