
public class ReverseInt7 {
	
	

	public static void main(String[] args){
		int x = 210;
		System.out.println(reverse(x));
	}	
	public static int reverse(int x){
		int rev = 0;
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE || x == 0){
			return rev;
		}
		while(x != 0){
			rev = rev * 10 + x % 10;
			x /= 10;
		}
		return rev;


	}
}