
public class CountAndSay38 {
	
	

	public static void main(String[] args){
		int n = 9;
		System.out.println(countAndSay(n));
	}
	public static String countAndSay(int n){
		String s = "1";
		for(int i = 0; i < n; i++){
			s = getNext(s);
		}
		return s;
	}
	private static String getNext(String s){
		StringBuilder sb = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;
		for(int i = 1; i < s.length(); i++){	//start from 1
			if(s.charAt(i) == c){
				count++;
			}else{
				sb.append(count);
				sb.append(c);
				c = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}	
}