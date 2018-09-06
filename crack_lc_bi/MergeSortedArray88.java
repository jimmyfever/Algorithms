
public class MergeSortedArray88 {
	
	

	public static void main(String[] args){
		
	}
	public void merge(int[] nums1, int m, int[] nums2, int n){

		int l1 = m - 1, l2 = n - 1, l = m + n - 1;
		while(l1 >= 0 || l2 >= 0){
			if(nums1[l1] >= nums2[l2]){
				nums1[l] = nums1[l1];
				l--;
				l1--;
			}else{
				nums1[l] = nums2[l2];
				l--;
				l2--;
			}
		}
		while(l2 >= 0){
			nums1[l] = nums2[l2];
			l--;
			l2--;
		}
	}	
}