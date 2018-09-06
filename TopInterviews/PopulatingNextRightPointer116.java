
public class PopulatingNextRightPointer116 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left, right, next;
	    TreeLinkNode(int x) { val = x; }
	}	
	public void connect(TreeLinkNode root){
		if(root == null) return;

		while(root.left != null){
			TreeLinkNode pre = root;
			while(root != null){
				root.left.next = root.right;
				root.right.next = (root.next != null) ? root.next.left : null;
				root = root.next;
			}
			root = pre.left;
		}
	}
}