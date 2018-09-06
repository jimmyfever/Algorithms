
public class RemoveDupFromSortedList {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}	
	public ListNode deleteDup(ListNode head){
		ListNode cur = head;
		while(cur != null){
			if(cur.next == null) break;

			if(cur.val == cur.next.val){
				cur.next = cur.next.next;
			}else{
				cur = cur.next;
			}
		}
		return head;
	}
}