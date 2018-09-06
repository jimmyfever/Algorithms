
public class SearchForRange34 {
	
	

	public static void main(String[] args){
		
	}
	public int[] searchRange(int[] nums, int target){
		int[] res = {-1, -1};

		if(nums == null || nums.length == 0) return res;

		int start = 0, end = nums.length -1;
		// res[0]
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] < target){
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
			return res;
		}

		end = nums.length - 1;	// reset end;
		// res[1]
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] > target){
				end = mid;
			}else{
				start = mid;
			}
		}
		if(nums[end] == target){
            res[1] = end;
        }else if(nums[start] == target){
            res[1] = start;
        }
		return res;
	}	

}