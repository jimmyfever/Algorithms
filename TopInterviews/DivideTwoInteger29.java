
public class DivideTwoInteger29 {
	
	

	public static void main(String[] args){
		
	}
	public int divide(int dividend, int divisor){
		if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)){
			return Integer.MAX_VALUE;
		}
		int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;

		long ldend = Math.abs((long)dividend);
		long lsor = Math.abs((long)divisor);
		long multiple = 1;
		long res = 0;
		while((lsor << 1) <= ldend){	// double divisor
			multiple <<= 1;
			lsor <<= 1;
		}
		while(multiple > 0){
			if(ldend >= lsor){
				ldend -= lsor;
				res += multiple;
			}
			multiple >>= 1;
			lsor >>= 1;
		}
		return sign == 1 ? (int)res : (int)-res;
	}	
}