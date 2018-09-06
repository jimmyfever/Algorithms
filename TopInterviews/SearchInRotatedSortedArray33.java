
public class SearchInRotatedSortedArray33 {
	
	

	public static void main(String[] args){
		
	}

	public int search(int[] nums, int target){
		if(nums == null || nums.length == 0) return -1;

		int lo = 0, hi = nums.length - 1;
		while(lo + 1 < hi){
			int mid = lo + (hi - lo) / 2;
			if(nums[mid] == target) return mid;
			if(nums[lo] < nums[mid]){
				if(nums[lo] <= target && target <= nums[mid]){
					hi = mid;
				}else{
					lo = mid;
				}
			}else{
				if(nums[mid] <= target && target <= nums[hi]){
					lo = mid;
				}else{
					hi = mid;
				}
			}
		}
		if(nums[lo] == target) return lo;
		if(nums[hi] == target) return hi;
		return -1;
	}	
}