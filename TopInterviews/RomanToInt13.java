import java.util.HashMap;

public class RomanToInt13 {

	
	public static void main(String[] args){
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}
	public static int romanToInt(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		{{
			map.put('I', 1);
			map.put('V', 5);
			map.put('X', 10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
		}};
		if(s == null || s.length() == 0){
			return 0;
		}
		int sum = 0;
		char[] chars = s.toCharArray();
		for(char c : chars){
			sum += map.get(c);
		}
		if(s.indexOf("IV") != -1){
			sum -= map.get('I') * 2;
		}
		if(s.indexOf("IX") != -1){
			sum -= map.get('I') * 2;
		}
		if(s.indexOf("XL") != -1){
			sum -= map.get('X') * 2;
		}
		if(s.indexOf("XC") != -1){
			sum -= map.get('X') * 2;
		}
		if(s.indexOf("CD") != -1){
			sum -= map.get('C') * 2;
		}
		if(s.indexOf("CM") != -1){
			sum -= map.get('C') * 2;
		}
		return sum;
	}	
}