
public class BTMaxPathSum124 {
	
	int res = Integer.MIN_VALUE;

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public int maxPathSum(TreeNode root){
		helper(root);
		return res;
	}
	private int helper(TreeNode root){
		if(root == null) return 0;

		int left = helper(root.left);
		int right = helper(root.right);
		if(left < 0){
			res = Math.max(res, Math.max(root.val, root.val + right));
		}else if(right < 0){
			res = Math.max(res, Math.max(root.val, root.val + left));
		}else{
			res = Math.max(res, left + root.val + right);
		}
		return Math.max(root.val, Math.max(root.val + left, root.val + right));
	}
}