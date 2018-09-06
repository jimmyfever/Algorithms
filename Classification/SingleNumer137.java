
public class SingleNumer137 {
	
	

	public static void main(String[] args){
		int[] n = {2,2,2,99,3,3,3};
		System.out.println(singleNum(n));
	}	
	public static int singleNum(int[] nums){
		int ones = 0, twos = 0;
		for(int i = 0; i < nums.length; i++){
			ones = (ones ^ nums[i]) & ~twos;
			twos = (twos ^ nums[i]) & ~ones;
		}
		return ones;
	}
}