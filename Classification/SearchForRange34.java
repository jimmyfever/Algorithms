import java.util.*;
public class SearchForRange34 {
	
	

	public static void main(String[] args){
		int[] n = {1,2,2,3,3};
		int t = 2;
		System.out.println(Arrays.toString(searchRange(n,t)));
	}	
	public static int[] searchRange(int[] nums, int target){
		int[] res = {-1, -1};
		if(nums == null || nums.length == 0){
			return res;
		}

		int start = 0, end = nums.length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] == target){
				end = mid;
			}else if(nums[mid] < target){
				start = mid;
			}else{
				end = mid;
			}
		}
		if(nums[start] == target){
			res[0] = start;
		}else if(nums[end] == target){
			res[0] = end;
		}else{
			res[0] = res[1] = -1;
			return res;
		}

		end = nums.length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] == target){
				start = mid;
			}else if(nums[mid] < target){
				start = mid;
			}else{
				end = mid;
			}
		}
		if(nums[end] == target){
			res[1] = end;
		}else if(nums[start] == target){
			res[1] = start;
		}else{
			res[0] = res[1] = -1;
			return res;
		}
		return res;
	}
}