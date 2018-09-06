
public class RotateList61 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode rotateList(ListNode head, int k){
		if(head == null || head.next == null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode l = dummy, r = dummy;

		int len;
		for( len = 0; r.next != null; len++ ){
			r = r.next;
		}

		for(int j = len - k%len; j>0; j--){
			l = l.next;
		}

		r.next = dummy.next;
		dummy.next = l.next;
		l.next = null;

		return dummy.next;
	}	
}