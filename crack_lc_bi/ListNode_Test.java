
public class ListNode_Test {
	
	

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int n = 5;

		ListNode head = createListNode(arr, n);
		deleteLinkedList(head);
		printLinkedList(head);
	}	
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public static ListNode createListNode(int[] arr, int n){
		if(n == 0){
			return null;
		}

		ListNode head = new ListNode(arr[0]);
		ListNode curNode = head;
		for(int i = 1; i < n; i++){
			curNode.next = new ListNode(arr[i]);
			curNode = curNode.next;
		}
		return head;
	}
	public static void printLinkedList(ListNode head){
		ListNode curNode = head;
		while( curNode != null){
			System.out.print(curNode.val + "->");
			curNode = curNode.next;
		}
		System.out.println("NULL");
		return;
	}
	public static void deleteLinkedList(ListNode head){
		ListNode curNode = head;
		while(curNode.next != null){
			ListNode delNode = curNode.next;
			curNode.next = delNode.next;
			delNode.next = null;
		}
		return;
	}

}