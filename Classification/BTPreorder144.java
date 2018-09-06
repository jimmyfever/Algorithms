import java.util.*;
public class BTPreorder144 {
	
	private List<Integer> list = new ArrayList<>();

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public List<Integer> preorder(TreeNode root){
		if(root == null) return list;

		list.add(root.val);
		preorder(root.left);
		preorder(root.right);
		return list;
	}
}