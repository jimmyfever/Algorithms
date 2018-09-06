import java.util.*;
public class Subset78 {
	
	

	public static void main(String[] args){
		int[] n = {1,1,2,3};
		System.out.println(subsets(n));
	}
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		dfs(res, new ArrayList<>(), nums, 0);
		return res;
	}	
	private static void dfs(List<List<Integer>> res, List<Integer> sub, int[] nums, int start){
		res.add(new ArrayList<>(sub));

		for(int i = start; i < nums.length; i++){
			sub.add(nums[i]);
			dfs(res, sub, nums, i + 1);
			sub.remove(sub.size() - 1);
		}
	}
}