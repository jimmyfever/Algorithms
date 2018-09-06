import java.util.*;
public class PermutationsII47 {
	
	

	public static void main(String[] args){
		
	}	
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		helper(res, new ArrayList<Integer>(), nums, new boolean[nums.length]);
		return res;
	}
	private void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] used){
		if(cur.size() == nums.length){
			res.add(new ArrayList<Integer>(cur));
		}
		for(int i = 0; i < nums.length; i++){
			if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
			used[i] = true;
			cur.add(nums[i]);
			helper(res, cur, nums, used);
			used[i] = false;
			cur.remove(cur.size()-1);
		}
	}
}