import java.util.*;
public class WordLadder127 {
	
	

	public static void main(String[] args){
		
	}
	public int ladderLength(String beginWord, String endWord, List<String> wordList){
		Set<String> dict = new HashSet<>(wordList);

		if(beginWord.equals(endWord)) return 1;

		Queue<String> queue = new LinkedList<>();
		queue.offer(beginWord);

		int length = 1;
		while(!queue.isEmpty()){
			length++;
			int size = queue.size();
			for(int i = 0; i < size; i++){
				String cur = queue.poll();
				for(String n : findNext(cur, dict)){
					if(n.equals(endWord)) return length;

					queue.offer(n);
				}
			}
		}
		return 0;
	}
	private List<String> findNext(String s, Set<String> dict){
		List<String> next = new ArrayList<>();

		for(String d : dict){
			int diff = 0;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == d.charAt(i)) continue;
				diff++;
			}
			if(diff == 1) next.add(d);
		}
		return next;
	}
}