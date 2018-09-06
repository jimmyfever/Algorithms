
public class ValidBST98 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean isValidBST(TreeNode root){
		long min = Long.MIN_VALUE;
		long max = Long.MAX_VALUE;
		return helper(root, min, max);
	}
	private boolean helper(TreeNode root, long min, long max){
		if(root == null) return true;
		if(root.val >= max || root.val <= min) return false;

		return helper(root.left, min, root.val) && helper(root.right, root.val, max);
	}
}