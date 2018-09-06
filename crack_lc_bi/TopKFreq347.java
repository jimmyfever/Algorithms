import java.util.*;
public class TopKFreq347 {
	
	

	public static void main(String[] args){
		
	}	
	class Pair{
		int val;
		int freq;
		public Pair(int val, int freq){
			this.val = val;
			this.freq = freq;
		}
	}
	class PairComparator implements Comparator<Pair> {
		public int compare (Pair a, Pair b){
			return b.freq - a.freq;
		}
	}
	public List<Integer> topK(int[] nums, int k){
		List<Integer> res = new ArrayList<>();
		if(nums == null || nums.length == 0) return res;

		PriorityQueue<Pair> maxHeap = new PriorityQueue<>();
		Map<Integer,Integer> map = new HashMap<>();

		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
		}
		for(int i = 0; i < k; i++){
			Pair tmp = maxHeap.poll();
			res.add(tmp.val);
		}
		return res;
	}
}