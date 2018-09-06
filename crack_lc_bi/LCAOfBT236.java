
public class LCAOfBT236 {
	
	

	public static void main(String[] args){
		
	}	
	public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
		if(root == null || root == p || root == q) return root;

		TreeNode left = lca(root.left, p, q);
		TreeNode right = lca(root.right, p, q);
		if(left != null && right != null) return root;
		return left != null ? left : right;
	}
}