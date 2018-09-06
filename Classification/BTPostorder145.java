import java.util.*;
public class BTPostorder145 {
	
	private List<Integer> list = new ArrayList<>();

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public List<Integer> postorder(TreeNode root){
		if(root == null) return list;

		postorder(root.left);
		postorder(root.right);
		list.add(root.val);
		return list;
	}	
}