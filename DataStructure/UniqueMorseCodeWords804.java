import java.util.TreeSet;
public class UniqueMorseCodeWords804 {
	
	public int uniqueMorse(String[] words){
		String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		TreeSet<String> set = new TreeSet<String>();
		for(String word : words){
			StringBuilder res = new StringBuilder();
			for(int i = 0; i < word.length(); i++){
				res.append(codes[word.charAt(i) - 'a']);
			}
			set.add(res.toString());
		}
		return set.size();
	}
}