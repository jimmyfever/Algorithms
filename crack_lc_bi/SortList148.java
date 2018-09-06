
public class SortList148 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
 	    int val;
 	    ListNode next;
 	    ListNode(int x) { val = x; }
 	}	

 	private ListNode findMid(ListNode head){
 		ListNode l = head, r = head.next;
 		while(r != null && r.next != null){
 			r = r.next.next;
 			l = l.next;
 		}
 		return l;
 	}
 	private ListNode merge(ListNode head1, ListNode head2){
 		ListNode dummy = new ListNode(0);
 		ListNode cur = dummy;
 		while(head1 != null && head2 != null){
 			if(head1.val < head2.val){
 				cur.next = head1;
 				head1 = head1.next;
 			}else{
 				cur.next = head2;
 				head2 = head2.next;
 			}
 			cur = cur.next;
 		}
 		if(head1 != null){
 			cur.next = head1;
 		}else{
 			cur.next = head2;
 		}
 		return dummy.next;
 	}
 	public ListNode sortList(ListNode head){
 		if(head == null || head.next == null) return head;

 		ListNode mid = findMid(head);

 		ListNode r = sortList(mid.next);
 		mid.next = null;
 		ListNode l = sortList(head);
 		return merge(l, r);
 	}
}