import java.util.*;
public class HappyNum202 {
	
	

	public static void main(String[] args){
		int n = 19;
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n){
		Set<Integer> set = new HashSet<>();
		int square, remain;
		while(set.add(n)){
			square = 0;
			while(n > 0){
				remain = n % 10;
				square += remain * remain;
				n /= 10;
			}
			if(square == 1){
				return true;
			}else{
				n = square;
			}
		}
		return false;
	}	
}