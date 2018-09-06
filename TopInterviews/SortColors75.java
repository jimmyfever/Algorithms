
public class SortColors75 {
	
	

	public static void main(String[] args){
		
	}
	public void sortColors(int[] nums){
		if(nums == null || nums.length <= 1){
			return;
		}

		int left = 0, right = nums.length - 1;
		int i = 0;
		while(i <= right){
			if(nums[i] == 0){
				swap(nums, left, i);
				left++;
				i++;
			}else if(nums[i] == 1){
				i++;
			}else{
				swap(nums, right, i);
				right--;
			}
		}
	}
	private void swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}	
}