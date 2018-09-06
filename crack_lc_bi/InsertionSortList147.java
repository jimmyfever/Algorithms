
public class InsertionSortList147 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode insertionSortList(ListNode head){
		ListNode dummy = new ListNode(0);

		while(head != null){
			ListNode node = dummy;
			while(node.next != null && node.next.val < head.val){
				node = node.next;
			}
			ListNode tmp = head.next;
			head.next = node.next;
			node.next = head;
			head = tmp;
		}
		return dummy.next;
	}
	//O(1) space
	public ListNode insertion(ListNode head){
		if(head == null) return head;

		ListNode dummy = new ListNode(0);
		ListNode cur = head;
		ListNode pre = dummy;
		ListNode next = null;
		while(cur != null){
			next = cur.next;
			while(pre.next != null && pre.next.val < cur.val){
				pre = pre.next;
			}
			cur.next = pre.next;
			pre.next = cur;
			pre = dummy;
			cur = next;
		}
		return dummy.next;
	}
}