import java.util.*;
public class BinaryWatch401 {
	
	

	public static void main(String[] args){
		
	}	
	public List<String> readBinaryWatch(int num){
		List<String> list = new ArrayList<>();
		for(int h = 0; h < 12; h++){
			for(int m = 0; m < 60; m++){
				if((Integer.bitCount(h) + Integer.bitCount(m)) == num){
					list.add(String.format("%d:%02d", h, m));
				}
			}
		}
		return list;
	}
}