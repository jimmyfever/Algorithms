
public class ReverseVowelsOfString345 {
	
	

	public static void main(String[] args){
		
	}	
	public String reverse(String s){
		if(s == null || s.length() == 0) return "";

		String v = "aeiouAEIOU";
		char[] c = s.toCharArray();
		int l = 0, r = c.length - 1;
		while(l < r){
			while(l < r && !v.contains(c[l]+"")){
				l++;
			}
			while(l < r && !v.contains(c[r]+"")){
				r--;
			}
			char tmp = c[l];
			c[l] = c[r];
			c[r] = tmp;
			l++;r--;
		}
		return new String(c);
	}
}