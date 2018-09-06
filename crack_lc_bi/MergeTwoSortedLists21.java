
public class MergeTwoSortedLists21 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null || l2 == null){
			return l1 == null ? l2 : l1;
		}
		ListNode pre = new ListNode(0), cur = pre;

		while(l1 != null && l2 != null){
			if(l1.val <= l2.val){
				cur.next = l1;
				l1 = l1.next;
			}else{
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		cur.next = l1 == null ? l2 : l1;

		return pre.next;
	}

}