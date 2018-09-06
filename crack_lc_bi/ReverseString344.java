
public class ReverseString344 {
	
	

	public static void main(String[] args){
		
	}	
	public String reverse(String s){
		if(s == null || s.length() == 0) return s;
		char[] c = s.toCharArray();

		int l = 0, r = c.length - 1;
		while(l < r){
			char tmp = c[l];
			c[l] = c[r];
			c[r] = tmp;
			l++;r--;
		}
		return new String(c);
	}
}