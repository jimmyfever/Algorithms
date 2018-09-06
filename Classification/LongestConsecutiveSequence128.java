import java.util.*;
public class LongestConsecutiveSequence128 {
	
	

	public static void main(String[] args){
		
	}	
	public int longestConsecutiveSequence(int[] nums){
		Set<Integer> set = new HashSet<>();
		for(int n : nums){
			set.add(n);
		}

		int ans = 0;
		for(int n : nums){
			if(set.contains(n)){
				set.remove(n);

				int l = n - 1;
				int r = n + 1;
				while(set.contains(l)){
					set.remove(l);
					l--;
				}
				while(set.contains(r)){
					set.remove(r);
					r++;
				}
				ans = Math.max(ans, r - l - 1);
			}
		}
		return ans;
	}
}