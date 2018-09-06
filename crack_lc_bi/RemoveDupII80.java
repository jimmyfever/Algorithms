
public class RemoveDupII80 {
	
	

	public static void main(String[] args){
		
	}
	public int removeDupII(int[] nums){
		int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(idx < 2 || nums[idx - 2] < nums[i]){
                nums[idx++] = nums[i];
            }
        }
        return idx;
	}	
}