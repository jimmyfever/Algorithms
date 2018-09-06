import java.util.*;
public class ExcelSheetColNum171 {
		

	public static void main(String[] args){
		
	}
	public int titleToNum(String s){
		int num = 0;
		for(int i = 0; i < s.length(); i++){
			num = num * 26 + (s.charAt(i) - 'A' + 1);
		}
		return num;
	}	
}