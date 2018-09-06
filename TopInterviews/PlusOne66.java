import java.util.*;
public class PlusOne66 {
	
	

	public static void main(String[] args){
		int[] digits = {9,9,9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}
	public static int[] plusOne(int[] digits){
		for(int i = digits.length - 1; i >=0; i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newArr = new int[digits.length + 1];
		newArr[0] = 1;
		return newArr;
	}	
}