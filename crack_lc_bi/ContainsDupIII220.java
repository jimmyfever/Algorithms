import java.util.*;
public class ContainsDupIII220 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean containsDup(int[] nums, int k, int t){
		if(nums == null || nums.length < 2 || k < 1) return false;
		TreeSet<Long> set = new TreeSet<Long>();

		for(int i = 0; i < nums.length; i++){
			Long l = (long) nums[i];
			Long floor = set.floor(l);
			Long ceil = set.ceiling(l);
			if((floor != null && l - floor <= t) || (ceil != null && ceil - l <= t)){
				return true;
			}
			set.add(l);

			if(l > k) set.remove((long)nums[i-k]);
		}
		return false;
	}
}
