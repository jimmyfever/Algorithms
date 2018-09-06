import java.util.*;
public class RemoveNthNode19 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode removeNth(ListNode head, int n){
		ListNode prev = new ListNode(-1);
		ListNode slow = prev;
		ListNode fast = prev;
		prev.next = head;

		for(int i = 0; i <= n; i++){
			fast = fast.next;
		}
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return prev.next;
	}
}