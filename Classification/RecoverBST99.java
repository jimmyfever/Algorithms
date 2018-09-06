
public class RecoverBST99 {
	
	TreeNode first = null;
	TreeNode second = null;
	TreeNode pre = new TreeNode(Integer.MIN_VALUE);

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public void recover(TreeNode root){
		traverse(root);

		int tmp = first.val;
		first.val = second.val;
		second.val = tmp;
	}
	private void traverse(TreeNode root){
		if(root == null) return;

		traverse(root.left);

		if(pre != null && pre.val > root.val){
			if(first == null){
				first = pre;
				second = root;
			}else{
				second = root;
			}
		}
		pre = root;

		traverse(root.right);
	}
}