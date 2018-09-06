
public class MaxDepthBT104 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public int maxDepth(TreeNode root){
		if(root == null) return 0;
		int max = 1;
		if(root.left == null && root.right == null) return max;

		max = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		return max;
	}
}