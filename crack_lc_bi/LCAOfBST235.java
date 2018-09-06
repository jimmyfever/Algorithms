
public class LCAOfBST235 {
	
	

	public static void main(String[] args){
		
	}	
	public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
		if(root == null) return null;

		if(p.val < root.val && q.val < root.val){
			return lca(root.left, p, q);
		}
		if(p.val > root.val && q.val > root.val){
			return lca(root.right, p, q);
		}

		return root;
	}
}