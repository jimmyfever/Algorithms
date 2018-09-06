
public class ReverseString344 {
	
	

	public static void main(String[] args){
		String s = "hello";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s){
        char[] chars = s.toCharArray();
		int left = 0, right = chars.length - 1;
		while(left < right){
			char tmp = chars[left];
			chars[left] = chars[right];
			chars[right] = tmp;
			left++;
			right--;
		}
		return new String(chars);
	}	
}