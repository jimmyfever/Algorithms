import java.util.*;
public class BTPostorder145_iterative {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public List<Integer> postorder(TreeNode root){
		ArrayList<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		TreeNode cur = root;

		if(root == null) return list;

		stack.push(root);
		while(!stack.empty()){
			cur = stack.peek();
			if(pre == null || pre.left == cur || pre.right == cur){ // pre is before cur, traverse down
				if(cur.left != null){
					stack.push(cur.left);
				}else if(cur.right != null){
					stack.push(cur.right);
				}
			}else if(cur.left == pre){	// pre is left sub tree of cur, traverse up from left sub
				if(cur.right != null){
					stack.push(cur.right);
				}
			}else{			// pre is right sub tree
				list.add(cur.val);
				stack.pop();
			}
			pre = cur;
		}
		return list;
	}
}