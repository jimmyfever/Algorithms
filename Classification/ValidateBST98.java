import java.util.*;
public class ValidateBST98 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public boolean isValid(TreeNode root){
		if(root == null) return true;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		while(root != null || !stack.isEmpty()){
			while(root != null){
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if(pre != null && root.val <= pre.val) return false;
			pre = root;
			root = root.right;
		}
		return true;
	}	

	public boolean isValid2(TreeNode root){
		return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
	}
	private boolean helper(TreeNode root, long max, long min){
		if(root == null) return true;
		if(root.val >= max || root.val <= min) return false;
		return helper(root.left, root.val, min) && helper(root.right, max, root.val);
	}
}