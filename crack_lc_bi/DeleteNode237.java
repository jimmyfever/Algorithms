
public class DeleteNode237 {
	
	

	public static void main(String[] args){
		
	}	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public void deleteNode(ListNode node){
		if(node == null) return;
		if(node.next == null){
			node = null;
			return;
		}

		node.val = node.next.val;
		node.next = node.next.next;

		return;
	}
}