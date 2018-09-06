
public class MinDepth111 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public int minDepth(TreeNode root){
		if(root == null) return 0;
		if(root.left != null && root.right != null){
			return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
		}
		if(root.left != null){
			return minDepth(root.left) + 1;
		}else{
			return minDepth(root.right) + 1;
		}
	}
}