import java.util.*;
public class WiggleSortII324 {
	
	

	public static void main(String[] args){
		
	}
	public void wiggleSort(int[] nums){
		int[] tmp = (int[]) nums.clone();
		Arrays.sort(tmp);
		int n = nums.length;
		int left = (n - 1) / 2;
		int right = n - 1;

		int index = 0;
		while(left >= 0 && right >= (n + 1) / 2){
			nums[index++] = tmp[left--];
			nums[index++] = tmp[right--];
		}
		if(left >= 0) {
			nums[index] = tmp[left];
		}
	}	
}