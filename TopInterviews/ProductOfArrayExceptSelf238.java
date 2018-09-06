
public class ProductOfArrayExceptSelf238 {
	
	

	public static void main(String[] args){
		
	}
	public int[] product(int[] nums){
		int n = nums.length, right = 1;
		int[] res = new int[n];
		res[0] = 1;	// like right = 1
		for(int i = 1; i < n; i++){
			res[i] = res[i - 1] * nums[i - 1];
		}
		for(int i = n - 1; i >= 0; i--){
			res[i] *= right;
			right *= nums[i]; 
		}
		return res;
	}	
}