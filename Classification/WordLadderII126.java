import java.util.*;
public class WordLadderII126 {
	
	

	public static void main(String[] args){
		
	}
	public List<List<String>> ladders(String beginWord, String endWord, List<String> wordList){
		Set<String> dict = new HashSet<>(wordList);
		List<List<String>> ladders = new ArrayList<>();
		HashMap<String, List<String>> neighbors = new HashMap<>();
		HashMap<String, Integer> distance = new HashMap<>();
		ArrayList<String> solution = new ArrayList<>();

		dict.add(beginWord);
		bfs(beginWord, endWord, dict, neighbors, distance);
		dfs(beginWord, endWord, dict, neighbors, distance, solution, ladders);
		return ladders;
	}	
	private void bfs(String start, String end, Set<String> dict, HashMap<String, List<String>> neighbors, HashMap<String, Integer> distance){
		for(String s : dict){
			neighbors.put(s, new ArrayList<String>());
		}
		Queue<String> queue = new LinkedList<>();
		queue.offer(start);
		distance.put(start, 0);

		while(!queue.isEmpty()){
			int size = queue.size();
			boolean foundEnd = false;
			for(int i = 0; i < size; i++){
				String cur = queue.poll();
				int curDistance = distance.get(cur);
				ArrayList<String> curNeighbors = getNeighbors(cur, dict);

				for(String n : curNeighbors){
					neighbors.get(cur).add(n);
					if(!distance.containsKey(n)){
						distance.put(n, curDistance + 1);
						if(end.equals(n)) foundEnd = true;
						else queue.offer(n);
					}
				}
				if(foundEnd) break;
			}
		}
	}
	private ArrayList<String> getNeighbors(String node, Set<String> dict){
		ArrayList<String> res = new ArrayList<>();

		for(String d : dict){
			int diff = 0;
			for(int i = 0; i < node.length(); i++){
				if(node.charAt(i) == d.charAt(i)) continue;
				diff++;
			}
			if(diff == 1) res.add(d);
		}
		return res;
	}
	private void dfs(String cur, String end, Set<String> dict, HashMap<String, List<String>> neighbors, HashMap<String, Integer> distance, ArrayList<String> solution, List<List<String>> ladders){
		solution.add(cur);
		if(end.equals(cur)){
			ladders.add(new ArrayList<String>(solution));
		}else{
			for(String next : neighbors.get(cur)){
				if(distance.get(next) == distance.get(cur) + 1){
					dfs(next, end, dict, neighbors, distance, solution, ladders);
				}
			}
		}
		solution.remove(solution.size() - 1);
	}
}