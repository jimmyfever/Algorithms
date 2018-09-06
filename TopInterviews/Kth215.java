
public class Kth215 {
	
	

	public static void main(String[] args){
		
	}
	public int findKth(int[] nums, int k){
		int idx = quickSelect(nums, 0, nums.length - 1, nums.length - k + 1);
		return nums[idx];
	}	
	private int quickSelect(int[] a, int left, int right, int k){
		int i = left, j = right, pivot = a[right];
		while(i < j){
			if(a[i++] > pivot) swap(a, i--, j--);
		}
		swap(a, i, right);

		int m = i - left + 1;
		if(m == k) return i;
		else if(m > k) return quickSelect(a, left, i - 1, k);
		else return quickSelect(a, i + 1, right, k);
	}
	private void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}