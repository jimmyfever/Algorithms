
public class PalindromeLinkedList234 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public boolean isPalin(ListNode head){
		if(head == null) return true;

		ListNode mid = findMid(head);
		mid.next = reverse(mid.next);
		ListNode p1 = head, p2 = mid.next;

		while(p1 != null & p2 != null && p1.val == p2.val){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2 == null;
	}	
	private ListNode findMid(ListNode head){
		if(head ==null) return null;
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next; 
		}
		return slow;
	}
	private ListNode reverse(ListNode head){
		ListNode prev = null;
		ListNode cur = head;
		while(cur != null){
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
}