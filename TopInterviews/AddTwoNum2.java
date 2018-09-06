
public class AddTwoNum2 {
	
	

	public static void main(String[] args){
		
	}
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode addTwoNum(ListNode l1, ListNode l2){
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;	// tail pointer
		int carry = 0;	// carray 1

		for(ListNode i = l1, j = l2; i != null || j != null; ){
			int sum = carry;
			sum += (i != null) ? i.val : 0;
			sum += (j != null) ? j.val : 0;

			tail.next = new ListNode(sum % 10);
			tail = tail.next;

			carry = sum / 10;
			i = (i == null) ? i : i.next;
			j = (j == null) ? j : j.next;
		}
		if(carry != 0){
			tail.next = new ListNode(1);
		}
		return dummy.next;
	}	
}