import java.util.*;
public class ContainsDup217 {
	
	

	public static void main(String[] args){
		
	}
	public boolean containsDup(int[] nums){
		if(nums == null || nums.length == 0){
			return false;
		}
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++){
			if(set.contains(nums[i])){
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}	
}