import java.util.*;
public class BTInorderTraversal94 {
	
	private List<Integer> list = new ArrayList<>();

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	// recursive
	public List<Integer> inorderTraversal(TreeNode root){
		
		if(root == null) return list;


		inorderTraversal(root.left);
		list.add(root.val);
		inorderTraversal(root.right);
		return list;
	}
}