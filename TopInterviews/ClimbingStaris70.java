
public class ClimbingStaris70 {
	
	

	public static void main(String[] args){
		int n = 47;
		System.out.println(climb(n));
	}	
	public static int climb(int n){
		if(n <= 1){
			return n;
		}

		int last = 1, lastlast = 1, now = 0;
		for(int i = 2; i <=n; i++){
			now = last + lastlast;
			lastlast = last;
			last = now;
		}
		return now;
	}
}