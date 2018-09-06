
public class RemoveDupFromSortedArray26 {
	
	

	public static void main(String[] args){
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(remove(nums));
	}
	public static int remove(int[] nums){
		if(nums.length < 2){
			return nums.length;
		}

		int res = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != nums[i - 1]){
				nums[res] = nums[i];	// keep the last duplicate
				res++;
			}
		}
		return res;
	}	
}