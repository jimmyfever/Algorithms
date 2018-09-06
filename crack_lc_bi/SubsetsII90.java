import java.util.*;
public class SubsetsII90 {
	
	

	public static void main(String[] args){
		int[] n = {1,2,2,2,2};
		System.out.println(subsets(n));
	}	
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> list = new ArrayList<>();

		if(nums == null || nums.length == 0) return list;

		helper(list, new ArrayList<Integer>(), nums, 0);
		return list;
	}
	private static void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int index){
		res.add(new ArrayList<Integer>(cur));
		for(int i = index; i < nums.length; i++){
			if(i > index && nums[i] == nums[i-1]) continue;
			cur.add(nums[i]);
			helper(res, cur, nums, i+1);
			cur.remove(cur.size()-1);
		}
		return;
	}
}