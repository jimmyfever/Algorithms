
public class Sqrt69 {
	
	

	public static void main(String[] args){
		int x = 1;
		System.out.println(sqrt(x));
	}
	// binary search
	public static int sqrt(int x){
		if(x == 0) return 0;
		int lo = 1, hi = x;
		while(lo + 1 < hi){
			int m = lo + (hi - lo) / 2;
			if(m * m <= x){
				lo = m;
			}else{
				hi = m;
			}
		}
		return lo;
	}	
}