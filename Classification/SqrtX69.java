
public class SqrtX69 {
	
	

	public static void main(String[] args){
		int x = 1000;
		System.out.println(sqrt(x));
	}	
	public static int sqrt(int x){
		if(x == 0) return 0;
		int start = 1, end = x;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(mid == x / mid){
				return mid;
			}else if(mid > x / mid){
				end = mid;
			}else{
				start = mid;
			}
		}
		if(start == x / start){
			return start;
		}
		if(end == x / end){
			return end;
		}
		return start;
	}
}