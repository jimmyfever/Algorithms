
public class ValidAnagram242 {
	
	

	public static void main(String[] args){
		
	}
	public boolean isAnagram(String s, String t){
		int[] count = new int[26];	// for Unicode, need 128 length
		for(int i = 0; i < s.length(); i++){
			count[s.charAt(i) - 'a']++;		// all letters are lowercase
		}
		for(int i = 0; i < t.length(); i++){
			count[t.charAt(i) - 'a']--;
		}
		for(int i : count){
			if(i != 0){
				return false;
			}
		}
		return true;
	}	
}