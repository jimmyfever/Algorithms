import java.util.*;
public class Permutations46 {
	
	

	public static void main(String[] args){
		
	}
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		dfs(list, new ArrayList<>(), nums);
		return list;
	}	
	private void dfs(List<List<Integer>> list, List<Integer> tmp, int[] nums){
		if(tmp.size() == nums.length){
			list.add(new ArrayList<>(tmp));
		}else{
			for(int i = 0; i < nums.length; i++){
				if(tmp.contains(nums[i])) continue;
				tmp.add(nums[i]);
				dfs(list, tmp, nums);
				tmp.remove(tmp.size() - 1);
			}
		}
	}
}