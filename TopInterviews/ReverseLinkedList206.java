
public class ReverseLinkedList206 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}	
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null) return head;

		ListNode prev = null;
		ListNode cur = head;
		while(cur != null){
			ListNode next = cur.next;	// cannot put this outsie loop
			cur.next = prev;
			prev = cur;
			cur = next;

		}
		return prev;
	}
}