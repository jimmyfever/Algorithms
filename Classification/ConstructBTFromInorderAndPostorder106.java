
public class ConstructBTFromInorderAndPostorder106 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public TreeNode construct(int[] inorder, int[] postorder){
		return helper(postorder.length - 1, 0, inorder.length - 1, inorder, postorder);
	}
	private TreeNode helper(int poStart, int inStart, int inEnd, int[] inorder, int[] postorder){
		if(poStart < 0 || poStart > postorder.length - 1 || inStart > inEnd) return null;

		TreeNode root = new TreeNode(postorder[poStart]);
		int inIndex = 0;
		for(int i = inStart; i <= inEnd; i++){
			if(inorder[i] == root.val){
				inIndex = i;
				break;
			}
		}
		root.left = helper(poStart - (inEnd - inIndex + 1), inStart, inIndex - 1, inorder, postorder);
		root.right = helper(poStart - 1, inIndex + 1, inEnd, inorder, postorder);
		return root;
	}
}