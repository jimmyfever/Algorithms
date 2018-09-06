import java.util.Stack;

public class ValidParenteses20 {
	
	

	public static void main(String[] args){
		String s = "(";
		System.out.println(isValid(s));
	}
	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()){
			if(c == '(' || c == '[' || c =='{'){
				stack.push(c);
			}
			// judge isEmpty before peek, or exception
			else if(c == ')'  && !stack.isEmpty() && stack.peek() == '('){
				stack.pop();
			}
			else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
				stack.pop();
			}
			else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
				stack.pop();
			}
		}
		return stack.isEmpty();

	}	
}