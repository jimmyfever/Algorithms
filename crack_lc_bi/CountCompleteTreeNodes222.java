
public class CountCompleteTreeNodes222 {
	
	

	public static void main(String[] args){
		
	}	
	public int countNodes(TreeNode root){
		if(root == null) return 0;

		TreeNode left = root, right = root;
		int depth = 0;
		while(right != null){
			left = left.left;
			right = right.right;
			depth++;
		}
		if(left == null){
			return (1 << depth) - 1;
		}
		return 1 + countNodes(root.left) + countNodes(root.right);
	}
}