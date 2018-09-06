
public class PowerOfThree326 {
	
	

	public static void main(String[] args){
		int n = 900;
		System.out.println(isPowerOfThree(n));
	}
	public static boolean isPowerOfThree(int n){
		if(n == 1) return false;
		return Math.pow(3, 19) % n == 0;
	}	
}