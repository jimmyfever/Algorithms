
public class RangeSumQuery307 {
	private int[] sum; //sum[i] 前i个元素和， sum[0] = 0; sum[i] : nums[0..i-1]和

	private int[] data;

	public NumArray(int[] nums){
		
		data = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			data[i] = nums[i];
		}

		sum = new int[nums.length + 1];
		sum[0] = 0;
		for(int i = 1; i < sum.length; i++){
			sum[i] = sum[i-1]+nums[i-1];
		}

	}
	public void update(int i, int val){
		data[i] = val;
		for(int index = i+1; index<sum.length; index++){
			sum[index] = sum[index-1]+data[index-1];
		}
	}

	public int sumRange(int i, int j){
		return sum[j+1]-sum[i];
	}
}