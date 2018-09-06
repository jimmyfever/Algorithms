import java.util.*;
public class FractionToRecurringDecimal166 {
	
	

	public static void main(String[] args){
		int num = 1, den = 13;
		System.out.println(fractionToDecimal(num, den));
	}	
	public static String fractionToDecimal(int numerator, int denominator){
		if(numerator == 0) return "0";
		if(denominator == 0) return "";

		String ans = "";

		//negative number
		if((numerator < 0) ^ (denominator < 0)){
			ans += "-";
		}

		//transfer to positive long number to avoid overflow
		long num = numerator, den = denominator;
		num = Math.abs(num);
		den = Math.abs(den);

		// integer part
		long res = num / den;
		ans += String.valueOf(res);

		long rem = (num % den) * 10;
		if(rem == 0) return ans;

		//decimal part
		HashMap<Long, Integer> map = new HashMap<>();
		ans += ".";
		while(rem != 0){
			if(map.containsKey(rem)){
				int begin = map.get(rem);
				String part1 = ans.substring(0, begin);
				String part2 = ans.substring(begin, ans.length());
				ans = part1 + "(" + part2 + ")";
				return ans;
			}

			map.put(rem, ans.length());
			res = rem / den;
			ans += String.valueOf(res);
			rem = (rem % den) * 10;
		}
		return ans;
	}
}