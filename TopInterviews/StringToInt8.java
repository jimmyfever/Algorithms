
public class StringToInt8 {
	
	

	public static void main(String[] args){
		
	}
	public int myAtoi(String s){
		if(s == null) return 0;

		s = s.trim();
		if(s.length() == 0) return 0;

		int sign = 1;
		int index = 0;
		if(s.charAt(index) == '+'){
			index++;
		}else if(s.charAt(index) == '-'){
			sign = -1;
			index++;
		}
		long num = 0;
		for( ; index < s.length(); index++){
			if(s.charAt(index) < '0' || s.charAt(index) > '9'){
				break;
			}
			num = num * 10 + (s.charAt(index) - '0');
			if(num > Integer.MAX_VALUE){
				break;
			}
		}
		if(num * sign >= Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(num * sign <= Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int) num * sign;
	}	
}