
public class SumOfLeftLeaves404 {
	

	public static void main(String[] args){
		
	}	
	public int sumOfLeftLeaves(TreeNode root){
		if(root == null) return 0;

		int sum = 0;
		if(root.left != null){
			TreeNode left = root.left;
			if(left.left == null && left.right == null){
				sum += left.val;
			}else{
				sum += sumOfLeftLeaves(left);
			}
		}
		if(root.right != null){
			TreeNode right = root.right;
			sum += sumOfLeftLeaves(right);
		}
		return sum;
	}
}