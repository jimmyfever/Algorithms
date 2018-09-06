import java.util.*;
public class MoveZeros283 {
	
	

	public static void main(String[] args){
		int[] n = {0,1,0,3,12};
		move(n);
		System.out.println(Arrays.toString(n));
	}
	public static void move(int[] nums){
		int k = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				if(i != k){
					int tmp = nums[i];
					nums[i] = nums[k];
					nums[k] = tmp;
					k++;
				}else{
					k++;
				}
			}
		}
	}
}