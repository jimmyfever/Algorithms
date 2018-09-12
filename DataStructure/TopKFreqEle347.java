import java.util.*;
public class TopKFreqEle347 {
	

	public List<Integer> topKFreq(int[] nums, int k){

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int n : nums){
			if(map.containsKey(n))
				map.put(n, map.get(n) + 1);
			else
				map.put(n, 1);
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b){
				return map.get(a) - map.get(b);
			}
		});
		for(int key : map.keySet()){
			if(pq.size() < k)
				pq.add(key);
			else if(map.get(key) > map.get(pq.peek())){
				pq.poll();
				pq.add(key);
			}
		}
		List<Integer> res = new LinkedList<>();
		while(!pq.isEmpty()){
			res.add(pq.poll());
		}
		return res;

	}
}