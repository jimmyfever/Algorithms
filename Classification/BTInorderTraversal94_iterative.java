import java.util.*;
public class BTInorderTraversal94_iterative {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public List<Integer> inorder(TreeNode root){
 		Stack<TreeNode> stack = new Stack<>();
 		ArrayList<Integer> list = new ArrayList<>();

 		TreeNode cur = root;
 		while(cur != null || !stack.empty()){
 			if(cur != null){
 				stack.add(cur);
 				cur = cur.left;
 			}else{
 				cur = stack.pop();
 				list.add(cur.val);
 				cur = cur.right;
 			}
 		} // while
 		return list;
 	}
}