
public class SameTree100 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public boolean isSame(TreeNode p, TreeNode q){
		if(p == null && q == null) return true;

		if(p == null || q == null) return false;

		if(p.val != q.val) return false;

		return isSame(p.left, q.left) && isSame(p.right, q.right);
	}	
}