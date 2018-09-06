
public class OddEvenLinkedList328 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode oddEvenList(ListNode head){
		if(head == null || head.next == null) return head;

		ListNode odd = head, even = head.next;
		ListNode evenHead = even;
		while(even != null && even.next != null){
			odd.next = odd.next.next;
			odd = odd.next;
			even.next = even.next.next;
			even = even.next;
		}
		odd.next = evenHead;

		return head;
	}	
}