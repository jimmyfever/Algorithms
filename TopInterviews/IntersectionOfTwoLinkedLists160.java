
public class IntersectionOfTwoLinkedLists160 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	public ListNode getNode(ListNode headA, ListNode headB){
		int lenA = length(headA), lenB = length(headB);

		while(lenA > lenB){
			headA = headA.next;
			lenA--;
		}
		while(lenA < lenB){
			headB = headB.next;
			lenB--;
		}
		while(headA != headB){
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	private int length(ListNode node){
		int length = 0;
		while(node != null){
			node = node.next;
			length++;
		}
		return length;
	}	
}