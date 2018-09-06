
public class UniqueBST96 {
	
	

	public static void main(String[] args){
		
	}	
	// Catalan numbers
	public int numBST(int n){
		int[] cnt = new int[n + 1];
		cnt[0] = 1;
		cnt[1] = 1;
		for(int i = 2; i <= n; i++){
			for(int j = 0; j < i; j++){	// i is root, j cannot equal i
				cnt[i] += cnt[j] * cnt[i - j - 1];
			}
		}
		return cnt[n];
	}
}