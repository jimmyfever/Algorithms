
public class WiggleSub376 {
	
	public int wiggleMaxLength(int[] nums){
		if(nums.length == 0) return 0;
		int res = 1;
		int preDiff = 0;
		for(int i = 1; i < nums.length; i++){
			int curDiff = nums[i]-nums[i-1];
			if((curDiff > 0 && preDiff <= 0) ||
				(curDiff < 0 && preDiff >= 0)){
					res++;
					preDiff = curDiff;
			}
		}
		return res;
	}
}