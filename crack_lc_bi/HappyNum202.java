import java.util.*;

public class HappyNum202 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean isHappy(int n){
		if(n == 1) return true;
		Map<Integer, Integer> map = new HashMap<>();
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