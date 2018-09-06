
public class SymmetricTree101 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public boolean isSym(TreeNode root){
		return root == null || helper(root.left, root.right);
	}
	public boolean helper(TreeNode left, TreeNode right){
			if(left == null || right == null){
				return left == right;
			}
			if(left.val != right.val){
				return false;
			}
			return helper(left.left, right.right) && helper(left.right, right.left);

	}
}