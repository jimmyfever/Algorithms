import java.util.*;
public class FizzBuzz412 {
	
	

	public static void main(String[] args){
		int n = 1;
		System.out.println(fizzBuzz(n));
	}	
	public static List<String> fizzBuzz(int n){
		List<String> res = new ArrayList<>();
		int i = 1;
		while(i <= n){
			if(i % 15 == 0){
				res.add("FizzBuzz");
			}
			else if(i % 3 == 0){
				res.add("Fizz");
			}
			else if(i % 5 == 0){
				res.add("Buzz");
			}
			else{res.add(Integer.toString(i));
			}
			i++;
		}
		return res;
	}
}