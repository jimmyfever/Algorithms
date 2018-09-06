import java.util.*;
public class test {
	
	

	public static void main(String[] args){
		int[][] t = new int[3][5];
		System.out.println(t.length);
		for(int i = 0; i < 3; i++){
			Arrays.fill(t[i], -1);
		}
		System.out.println(t[2][4]);


	}
		
}