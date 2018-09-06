
public class SearchRotatedSortedArrayII81 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean search(int[] nums, int target){
		if(nums == null || nums.length == 0) return false;

		int start = 0, end = nums.length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] == target){
				return true;
			}else if(nums[mid] == nums[start]){
				start++;
			}else if(nums[mid] == nums[end]){
				end--;
			}else if(nums[start] < nums[mid]){
				if(nums[start] <= target && target <= nums[mid]){
					end = mid;
				}else{
					start = mid;
				}
			}else{
				if(nums[mid] <= target && target <= nums[end]){
					start = mid;
				}else{
					end = mid;
				}
			}
		} // while
		if(nums[start] == target) return true;
		if(nums[end] == target) return true;
		return false;
	}
}