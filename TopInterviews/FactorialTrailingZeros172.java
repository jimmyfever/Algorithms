
public class FactorialTrailingZeros172 {
	
	

	public static void main(String[] args){
		int n = 100;
		System.out.println(zeros(n));
	}
	public static int zeros(int n){
		//find how many 5s
		int ans = 0;
		while(n > 0){
			n /= 5;
			ans += n;
		}
		return ans;
	}	
}