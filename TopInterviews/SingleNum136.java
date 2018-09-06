
public class SingleNum136 {
	
	

	public static void main(String[] args){
		int[] n = {4,1,1,2,2};
		System.out.println(single(n));

	}
	public static int single(int[] nums){
		int ans = 0;
		for(int i = 0; i < nums.length; i++){
			ans ^= nums[i];
		}
		return ans;
	}	
}