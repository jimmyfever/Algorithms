
public class MergeTwoSortedLists21 {
	
	

	public static void main(String[] args){
		}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode merge(ListNode l1, ListNode l2){
		// recursion
		if(l2 == null){
			return l1;
		}
		if(l1 == null){
			return l2;
		}
		if(l1.val <= l2.val){
			l1.next = merge(l1.next, l2);
			return l1;
		}else{
			l2.next = merge(l1, l2.next);
			return l2;
		}

	}
	public ListNode merge1(ListNode l1, ListNode l2){
		// non-recursion
		if(l1 == null && l2 == null) return null;
		if(l1 == null) return l2;
		if(l2 == null) return l1;

		ListNode res = new ListNode(-1);
		ListNode prev = res;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				prev.next = l1;
				l1 = l1.next;
			}else{
				prev.next = l2;
				l2 = l2.next;
			}
			prev = prev.next;
		}
		if(l1 != null){
			prev.next = l1;
		}
		if(l2 != null){
			prev.next = l2;
		}
		return res.next;

	}	
}