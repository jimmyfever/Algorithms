
public class SwapNodesinPairs24 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode swapPairs(ListNode head){
		if(head == null || head.next == null) return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode pre = dummy;
		while(pre.next != null && pre.next.next != null){
			ListNode node1 = pre.next;
			ListNode node2 = node1.next;
			ListNode next = node2.next;

			node2.next = node1;
			node1.next = next;
			pre.next = node2;

			pre = node1;
		}

		return dummy.next;
	}
}