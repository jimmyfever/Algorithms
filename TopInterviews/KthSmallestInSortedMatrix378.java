
public class KthSmallestInSortedMatrix378 {
	
	

	public static void main(String[] args){
		
	}	
	public int kthSmallest(int[][] matrix, int k){
		int n = matrix.length - 1;
		int lo = matrix[0][0], hi = matrix[n][n];
		while(lo < hi){
			int mid = lo + (hi - lo) / 2;
			int tmp = searchLowerThanMid(matrix, n, mid);
			if(tmp < k) lo = mid + 1;
			else hi = mid;
		}
		return lo;
	}
	private int searchLowerThanMid(int[][] matrix, int n, int target){
		int i = n, j = 0, count = 0;
		while(i >= 0 && j <= n){
			if(matrix[i][j] <= target){ // check from left bottom
				j++;
				count += i + 1;
			}else{
				i--;
			}
		}
		return count;
	}
}