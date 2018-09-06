
public class LongestIncreasingSubsequence300 {
	
	

	public static void main(String[] args){
		
	}
	public int LengthOfLIS(int[] nums){
		int[] f = new int[nums.length];
		int max = 0;
		for(int i = 0; i < nums.length; i++){
			f[i] = 1;
			for(int j = 0; j < i; j++){
				if(nums[j] < nums[i]){
					f[i] = f[i] > f[j] + 1 ? f[i] : f[j] + 1;
				}
			}
			if(f[i] > max){
				max = f[i];
			}
		}
		return max;
	}	

	public int lengthOfLIS2(int[] nums){
		int[] minLast = new int[nums.length + 1];
		minLast[0] = Integer.MIN_VALUE;
		for(int i = 1; i <= nums.length; i++){
			minLast[i] = Integer.MAX_VALUE;
		}

		for(int i = 0; i < nums.length; i++){
			// find the first number in minLast >= nums[i]
			int index = binarySearch(minLast, nums[i]);
			minLast[index] = nums[i];
		}
		for(int i = nums.length; i >= 1; i--){
			if(minLast[i] != Integer.MAX_VALUE){
				return i;
			}
		}
		return 0;
	}
	private int binarySearch(int[] minLast, int num){
		int start = 0, end = minLast.length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(minLast[mid] < num){
				start = mid;
			}else{
				end = mid;
			}
		}
		return end;
	}
}