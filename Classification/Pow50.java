
public class Pow50 {
	
	

	public static void main(String[] args){
		double x = 2.0;
		int n = Integer.MIN_VALUE;
		System.out.println(myPow(x, n));
	}	
	public static double myPow(double x, int n){
		if(x == 0) return 0;
		if(n == 0) return 1;

		if(n < 0) {
			x = 1 / x;
			// n = -n; could overflow
			return (n % 2 == 0) ? myPow(x * x, -(n / 2)) : x * myPow(x * x, -(n / 2));

		}
		return (n % 2 == 0) ? myPow(x*x, n / 2) : x * myPow(x*x, n / 2);
	}
}