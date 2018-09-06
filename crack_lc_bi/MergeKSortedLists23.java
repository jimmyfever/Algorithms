import java.util.*;
public class MergeKSortedLists23 {
	
	

	public static void main(String[] args){
		
	}	
	public ListNode mergeKLists(ListNode[] lists){
		if(lists == null || lists.length == 0) return null;

		PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>(){
			@Override
			public int compare(ListNode n1, ListNode n2){
				if(n1.val < n2.val){
					return -1;	//升序
				}else if(n1.val == n2.val){
					return 0;
				}else{
					return 1;
				}
			}
		});

		ListNode dummy = new ListNode(0);
		ListNode head = dummy;

		for(ListNode node : lists){
			if(node != null){
				queue.add(node);
			}
		}

		while(!queue.isEmpty()){
			head.next = queue.poll();
			head = head.next;

			if(head.next != null){
				queue.add(head.next);
			}
		}
		return dummy.next;
	}
}