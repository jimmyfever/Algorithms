
public class MyPow50 {
	
	

	public static void main(String[] args){
		
	}	
	public double myPow(double x, int n){
		long ln = n;
		return helper(x, ln);
	}
	private double helper(double x, long n){
		if(n == 0) return 1;
		if(n < 0){
			n = -n;
			x = 1 / x;
		}
		return n % 2 == 0 ? helper(x * x, n / 2) : x * helper(x * x, n / 2);
	}
}