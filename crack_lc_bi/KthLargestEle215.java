import java.util.*;
public class KthLargestEle215 {
	
	

	public static void main(String[] args){
		
	}	
	public int findKth(int[] nums, int k){
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int n : nums){
			queue.offer(n);
			if(queue.size() > k){
				queue.poll();
			}
		}
		return queue.peek();
	}
}