import java.util.*;
public class EvaluateReversePolishNotation150 {
	
	

	public static void main(String[] args){
		
	}	
	public int evalRPN(String[] tokens){
		Stack<Integer> s = new Stack<>();
		String operators = "+-*/";
		for(String token : tokens){
			if(!operators.contains(token)){
				s.push(Integer.valueOf(token));
				continue;  // continue push numbers into stack
			}
			int n1 = s.pop();
			int n2 = s.pop();
			if(token.equals("+")){
				s.push(n2 + n1);
			}else if(token.equals("-")){
				s.push(n2 - n1);
			}else if(token.equals("*")){
				s.push(n2 * n1);
			}else{
				s.push(n2 / n1);
			}
		}// end for
		return s.pop();
	}
}