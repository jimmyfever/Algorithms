
public class PalindromeNumber9 {
	
	

	public static void main(String[] args){
		int x = 10201;
		System.out.println(isPalindrome(x));
	}
	public static boolean isPalindrome(int x){
		if(x < 0 || (x != 0 && x % 10 == 0))return false;
		int rev = 0;
		while(x > rev){
			rev = rev * 10 + x % 10;
			x /= 10;
		}
		System.out.println(rev);
		return (x == rev || x == rev / 10);

	}	
}