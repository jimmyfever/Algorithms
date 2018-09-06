
public class LCP14 {
	
	

	public static void main(String[] args){
		String[] strs = {"dog","racecar","car"};
		System.out.println(lcf(strs));
	}
	public static String lcf(String[] strs){
		if(strs == null || strs.length == 0){
			return "";
		}
		String prev = strs[0];
		for(int i = 1; i < strs.length; i++){
			while(strs[i].indexOf(prev) != 0){	// prefix, so index must == 0
				prev = prev.substring(0, prev.length() - 1);
			}
		}
		return prev;
	}	
}