import java.util.*;
class Solution {
	private int[] nums;
	private Random rand;

    public Solution(int[] nums) {
        this.nums = nums;
        rand = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int[] tmpA = nums.clone();
        for(int j = 1; j < tmpA.length; j++){
        	int i = rand.nextInt(j + 1);
        	swap(tmpA, i, j);
        }
        return tmpA;
    }
    private void swap(int[] tmpA, int i, int j){
    	int tmp = tmpA[i];
    	tmpA[i] = tmpA[j];
    	tmpA[j] = tmp;
    }
}