
public class SingleNum136 {
	
	

	public static void main(String[] args){
		int[] n = {5,1,2,1,2};
		System.out.println(singleNum(n));
	}	
	public static int singleNum(int[] nums){
		int res = nums[0];
		for(int i = 1; i < nums.length; i++){
			res ^= nums[i]; 
		}
		return res;
	}
}