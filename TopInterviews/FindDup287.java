
public class FindDup287 {
	
	

	public static void main(String[] args){
		
	}
	public int findDup(int[] nums){
		if(nums == null || nums.length <= 1){
			return -1;
		}

		int slow = nums[0];
		int fast = nums[nums[0]];
		while(slow != fast){
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		int finder = 0;
		while(finder != slow){
			finder = nums[finder];
			slow = nums[slow];
		}
		return slow;
	}	
}