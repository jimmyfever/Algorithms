import java.util.*;
public class WordPattern290 {
	
	

	public static void main(String[] args){
		
	}
	public boolean wordPattern(String pattern, String str){
		char[] patterns = pattern.toCharArray();
		String[] words = str.split(" ");
		Map<Character, String> map = new HashMap<>();

		if(patterns.length != words.length) return false;
		
		for(int i = 0; i < patterns.length; i++){
			if(map.containsKey(patterns[i])){
				if(!map.get(patterns[i]).equals(words[i])){
					return false;
				}
				continue;
			}
			if(!map.containsKey(patterns[i])){
				if(map.containsValue(words[i])){
					return false;	
				}
			}
			map.put(patterns[i], words[i]);
		}
		return true;
	}	

}