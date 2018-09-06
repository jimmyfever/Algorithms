
public class PathSum112 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public boolean hasPathSum(TreeNode root, int sum){
 		if(root == null && sum != 0) return false;

 		if(root.left == null && root.right == null && root.val == sum){
 			return true;
 		}

 		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
 	}
}