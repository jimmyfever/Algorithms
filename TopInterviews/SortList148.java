import java.util.*;
public class SortList148 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode sortList(ListNode head){
		if(head == null || head.next == null) return head;

		ListNode mid = findMid(head);
		ListNode right = sortList(mid.next);
		mid.next = null;
		ListNode left = sortList(head);
		return merge(left, right);
	}
	private ListNode findMid(ListNode head){
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	private ListNode merge(ListNode head1, ListNode head2){
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(head1 != null && head2 != null){
			if(head1.val < head2.val){
				tail.next = head1;
				head1 = head1.next;
			}else{
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
			if(head1 != null){
				tail.next = head1;
			}else{
				tail.next = head2;
			}
		}
		return dummy.next;
	}
}