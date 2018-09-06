import java.util.*;
public class CombinSumII40 {
	
	

	public static void main(String[] args){
		
	}	
	public List<List<Integer>> combinSumII(int[] candidates, int target){
		List<List<Integer>> res = new ArrayList<>();
		helper(res, new ArrayList<Integer>(), candidates, target, 0);
		return res;
	}
	private void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int remain, int index){
		if(remain < 0){
			return;
		}else if(remain == 0){
			res.add(new ArrayList<Integer>(cur));
			return;
		}else{
			for(int i = index; i < nums.length; i++){
				if(i > index && nums[i] == nums[i+1]) continue;
				cur.add(nums[i]);
				helper(res, cur, nums, remain - nums[i], i+1);
				cur.remove(cur.size()-1);
			}
		}
	}
}