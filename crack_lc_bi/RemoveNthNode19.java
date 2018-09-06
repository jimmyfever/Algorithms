
public class RemoveNthNode19 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode removeNthNode(ListNode head, int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode l = dummy, r = dummy;

		for(int i = 0; i <= n; i++){
			r = r.next;
		}
		while(r != null){
			l = l.next;
			r = r.next;
		}

		l.next = l.next.next;

		return dummy.next;
	}
}