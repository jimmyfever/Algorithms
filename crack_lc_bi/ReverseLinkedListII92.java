
public class ReverseLinkedListII92 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}	
	public ListNode reverseBetween(ListNode head, int m, int n){
		if(m >= n || head == null) return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;

		for(int i = 0; i < m-1; i++){
			pre = pre.next;
		}
		ListNode start = pre.next;
		ListNode then = start.next;

		for(int i = 0; i < n - m; i++){
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;
		}
		return dummy.next;
	}
}