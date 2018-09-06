
public class BinarySearch {
	
	

	public static void main(String[] args){
		
	}

	//明确变量含义
	//循环不变量
	//小数据量调试
	//大数据量测试
	public int binarySearch(int[] nums, int target){
		int l = 0, r = nums.length - 1;
		while(l <= r){
			int mid = l + (r - l) / 2;
			if(nums[mid] == target){
				return mid;
			}
			if(target > nums[mid]){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}
		return -1;
	}	
}