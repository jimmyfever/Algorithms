import java.util.*;
public class BasicCalculatorII227 {
	
	

	public static void main(String[] args){
		String s = "3+5/2";
		System.out.println(calculate(s));
	}	
	public static int calculate(String s){
		if(s == null || s.length() == 0){
			return 0;
		}


		Stack<Integer> stack = new Stack<>();
		char sign = '+';
		int num = 0;

		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				num = num * 10 + c - '0';	// when num >= 10
			}
			if(c != ' ' && !Character.isDigit(c) || i + 1 == s.length()){
				if(sign == '+'){
					stack.push(num);
				}else if (sign == '-'){
					stack.push(-num);
				}else if(sign == '/'){
					stack.push(stack.pop() / num);
				}else if(sign == '*'){
					stack.push(stack.pop() * num);
				}
				sign = c;
				num = 0;
			}
		}
		int res = 0;
		while(!stack.isEmpty()){
			res += stack.pop();
		}
		return res;
	}
}