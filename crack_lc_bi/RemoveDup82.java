
public class RemoveDup82 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode deleteDup(ListNode head){
		if(head == null || head.next == null) return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;

		while(cur != null){
			while(cur.next != null && cur.val == cur.next.val){
				cur = cur.next;
			}
			if(pre.next != cur){
				pre.next = cur.next;
				cur = pre.next;
			}else{
				pre = pre.next;
				cur = cur.next;
			}
		}
		return dummy.next;
	}
}