import java.util.*;
public class CombinSum39 {
	
	

	public static void main(String[] args){
		
	}
	public List<List<Integer>> combinSum(int[] candidates, int target){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(candidates);
		helper(res, new ArrayList<Integer>(), candidates, target, 0);
		return res;
	}	
	private void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int remain, int index){
		if(remain < 0) {
			return;
		}else if(remain == 0){
			res.add(new ArrayList<>(cur));
		}else{
			for(int i = index; i < nums.length; i++){
				cur.add(nums[i]);
				helper(res, cur, nums, remain - nums[i], i);
				cur.remove(cur.size()-1);
			}
		}
	}
}