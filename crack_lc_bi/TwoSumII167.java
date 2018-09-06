
public class TwoSumII167 {
	
	

	public static void main(String[] args){
		
	}	
	public int[] twoSumII(int[] numbers, int target){
		int[] res = new int[2];
		if(numbers == null || numbers.length < 2) return res;

		int l = 0, r = numbers.length - 1;
		while(l < r){
			int sum = numbers[l] + numbers[r];
			if(sum == target){
				res[0] = l+1;
				res[1] = r+1;
				break;
			}else if(sum > target){
				r--;
			}else{
				l++;
			}
		}
		return res;
	}
}