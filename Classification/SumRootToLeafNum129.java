
public class SumRootToLeafNum129 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public int sum(TreeNode root){
 		return helper(root, 0);
 	}	
 	private int helper(TreeNode root, int pre){
 		if(root == null) return 0;

 		int sum = root.val + pre * 10;
 		if(root.left == null && root.right == null){
 			return sum;
 		}
 		return helper(root.left, sum) + helper(root.right, sum);
 	}
}