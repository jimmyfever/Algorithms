
public class IsomorphicStrings205 {
	
	

	public static void main(String[] args){
		String s = "ab";
		String t = "aa";
		System.out.println(isIsomorphic(s, t));
	}
	public static boolean isIsomorphic(String s, String t){
		int[] a = new int[256];
		int[] b = new int[256];

		int len = s.length();
		for(int i = 0; i < len; i++){
			if(a[s.charAt(i)] != b[t.charAt(i)]){
				return false;
			}
			a[s.charAt(i)] = b[t.charAt(i)] = i + 1;
		}
		return true;
	}	
}