import java.util.List;
import java.util.ArrayList;

public class PermutationAndCombination_Template {
	
	

	public static void main(String[] args){
		
	}	
	//DFS
	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		
		if(nums == null){
			return res;
		}

		if(nums.length == 0){
			res.add(new ArrayList<Integer>());
			return res;
		}

		helper(new ArrayList<Integer>(), nums, 0, res);
		return res;
	}
	private void helper(ArrayList<Integer> subset, int[] nums, int pos, List<List<Integer>> res){
		res.add(new ArrayList<Integer>(subset));

		for(int i = pos; i < nums.length; i++){
			subset.add(nums[i]);
			helper(subset, nums, i + 1, res);
			subset.remove(subset.size() - 1);
		}
	}
}