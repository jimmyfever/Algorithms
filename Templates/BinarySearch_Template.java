
public class BinarySearch_Template {
	
	

	public static void main(String[] args){
		
	}
	public int binarySearch(int[] nums, int target){
		if(nums.length == 0){
			return -1;
		}

		int start = 0;
		int end = nums.length - 1;
		int mid;

		while(start + 1 < end){		// +1 here, do not need +1 in the while
			mid = start + (end - start) / 2;	// avoid overflow
			if(nums[mid] == target){
				end = mid;				//first postion, mid = end. But last postion, start = mid.
			}else if(nums[mid] < target){
				start = mid;
			}else if(nums[mid] > target){
				end = mid;
			}
		}
		if(nums[start] == target){	//find first position, compare start firstly 
			return start;
		}
		if(nums[end] == target){
			return end;
		}

		return -1;
	}	
}