
public class JumpGame55 {
	
	

	public static void main(String[] args){
		
	}
	// greedy
	public boolean canJump(int[] nums){
		int max = 0;
		for(int i = 0; i < nums.length; i++){
			if(i > max) return false;

			max = Math.max(max, nums[i] + i);
		}
		return true;
	}	

	// DP
	public boolean canJump1(int[] nums){
		boolean[] can = new boolean[nums.length];
		can[0] = true;

		for(int i = 1; i < nums.length; i++){
			for(int j = 0; j < i; j++){
				if(can[j] && j + nums[i] >= i){
					can[i] = true;
					break;
				}
			}
		}
		return can[nums.length - 1];
	}
}