
public class PathSum112 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean hasPathSum(TreeNode root, int sum){
		if(root == null) return false;
		if(root.left == null && root.right == null && root.val == sum){
			return true;
		}

		return hasPathSum(root.left, sum - root.left.val) || hasPathSum(root.right, sum - root.right.val);
	}
}