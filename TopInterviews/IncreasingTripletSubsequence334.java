
public class IncreasingTripletSubsequence334 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean increasingTriplet(int[] nums){
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for(int n : nums){
			if(n <= min) min = n;
			else if(n < secondMin) secondMin = n;
			else if(n > secondMin) return true;
		}
		return false;
	}
}