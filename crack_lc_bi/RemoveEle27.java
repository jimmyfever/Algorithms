import java.util.*;
public class RemoveEle27 {
	
	

	public static void main(String[] args){
		
	}	
	public int removeEle(int[] nums, int val){
		if(nums.length == 0 || nums == null) return 0;

		int len = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != val){
				nums[len] = nums[i];
				len++;
			}
		}
		return len;

	}
}