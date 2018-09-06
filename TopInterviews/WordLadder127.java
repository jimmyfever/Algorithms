import java.util.*;
public class WordLadder127 {
	
	

	public static void main(String[] args){
		
	}
	public int ladderLength(String beginWord, String endWord, Set<String> wordList){
		if(beginWord.equals(endWord)){
			return 1;
		}
		if(wordList.size() == 0){
			return 0;
		}

		int change = 0;
		wordList.add(endWord);
		Queue<String> queue = new LinkedList<>();
		queue.offer(beginWord);

		while(!queue.isEmpty()){
			change++;
			int size = queue.size();
			for(int i = 0; i < size; i++){
				String cur = queue.poll();
				if(cur.equals(endWord)){
					return change;
				}
				List<String> next = findNextAndRemove(cur, wordList);
				for(String s : next){
					if(s.equals(endWord)){
						return change + 1;
					}
					queue.offer(s);
				} // end for
			} // end for
		} // end while
		return change;
	}
	private List<String> findNextAndRemove(String s, Set<String> wordList){
		List<String> next = new ArrayList<>();

		for(String d : wordList){
			int diff = 0;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == d.charAt(i)){
					continue;
				}
				diff++;
			}
			if(diff == 1){
				next.add(d);
			}
		}
		wordList.removeAll(next);
		return next;
	}	
}