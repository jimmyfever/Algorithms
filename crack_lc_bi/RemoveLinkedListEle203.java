
public class RemoveLinkedListEle203 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode removeEle(ListNode head, int val){
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode cur = dummy;
		while(cur.next != null){
			if(cur.next.val == val){
				ListNode del = cur.next;
				cur.next = del.next;
			}else{
				cur = cur.next;
			}
		}
		return dummy.next;
	}
}