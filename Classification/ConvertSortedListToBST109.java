
public class ConvertSortedListToBST109 {
	
	private ListNode cur;

	public static void main(String[] args){
		
	}	
	public class ListNode {
 	    int val;
 	    ListNode next;
 	    ListNode(int x) { val = x; }
 	}
 
 	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public TreeNode convert(ListNode head){
 		int size;
 		cur = head;

 		if(head == null) return null;
 		size = getSize(head);

 		return helper(size);
 	}
 	private int getSize(ListNode head){
 		int size = 0;
 		while(head != null){
 			size++;
 			head = head.next;
 		}
 		return size;
 	}
 	private TreeNode helper(int size){
 		if(size <= 0) return null;

 		TreeNode left = helper(size/2);
 		TreeNode root = new TreeNode(cur.val);
 		cur = cur.next;
 		TreeNode right = helper(size - 1 - size/2);

 		root.left = left;
 		root.right = right;
 		return root;
 	}
}