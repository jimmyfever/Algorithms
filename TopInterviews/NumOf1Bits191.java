
public class NumOf1Bits191 {
	
	

	public static void main(String[] args){
		int n = 127;
		System.out.println(hammingWeight(n));
	}
	public static int hammingWeight(int n){
		int ans = 0;
		for(int i = 0; i < 32; i++){
			if((n & 1) == 1){
				ans++;
			}
			n = n >> 1;
		}
		return ans;
	}	
}