
public class RemoveDup26 {
	
	

	public static void main(String[] args){
		int[] n = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDup(n));
	}	
	public static int removeDup(int[] nums){
       	if(nums == null || nums.length == 0) return 0;
		if(nums.length <= 2) return nums.length;

		int idx = 0;
		for(int i = 0; i < nums.length; i++){
			if(idx < 2 || nums[idx - 2] < nums[i]){
				nums[idx++] = nums[i];
			}
		}
		return idx;
	}
}