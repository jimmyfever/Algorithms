import java.util.*;
public class SortCharByFreq451 {
	
	

	public static void main(String[] args){
		
	}	
	public String freq(String s){
		Map<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
			new Comparator<Map.Entry<Character, Integer>>(){
				@Override
				public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b){
					return b.getValue() - a.getValue();
				}
			}
		);
		pq.addAll(map.entrySet());
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()){
			Map.Entry e = pq.poll();
			for(int i = 0; i < (int)e.getValue(); i++){
				sb.append(e.getKey());
			}
		}
		return sb.toString();
	}
}