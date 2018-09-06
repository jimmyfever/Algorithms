
public class SearchInsertPosition35 {
	
	

	public static void main(String[] args){
		int[] n = {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(n, target));
	}	
	public static int searchInsert(int[] nums, int target){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int start = 0, end = nums.length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] == target){
				return mid;
			}else if(nums[mid] > target){
				end = mid;
			}else{
				start = mid;
			}
		}

		if(nums[start] >= target){
			return start;
		}else if(nums[end] >= target){
			return end;
		}else{
			return end + 1;
		}
	}
}