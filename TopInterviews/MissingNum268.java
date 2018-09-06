
public class MissingNum268 {
	
	

	public static void main(String[] args){
		int[] n = {9,7,6,5,4,3,2,0,1};
		System.out.println(missingNum(n));
	}
	public static int missingNum(int[] nums){
		int res = 0;
		for(int i = 0; i < nums.length; i++){
			res = res ^ (i + 1) ^ nums[i]; // if no missing num, res = 0, nums[i] = i+1
		}
		return res;
	}	
}