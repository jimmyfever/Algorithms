import java.util.*;
public class HappyNum202_mine {
	
	

	public static void main(String[] args){
		int n = 19;
		System.out.println(isHappy(n));
	}
	public static boolean isHappy(int n){
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0, remain = 0;
		map.put(n, 1);
		while(sum != 1){
			sum = 0;
			remain = 0;
			while(n > 0){
				remain = n % 10;
				sum += remain * remain;
				n /= 10;
			}
			if(map.containsKey(sum)){
				return false;
			}else{
			n = sum;
			map.put(n, 1);
			}
		}
		return true;
	}	
}