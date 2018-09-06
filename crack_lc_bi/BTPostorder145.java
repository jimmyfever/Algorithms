import java.util.*;
public class BTPostorder145 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
	public List<Integer> postorder(TreeNode root){
		LinkedList<Integer> list = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while(cur != null || !stack.isEmpty()){
			if(cur != null){
				stack.push(cur);
				list.addFirst(cur.val);
				cur = cur.right;
			}else{
				TreeNode node = stack.pop();
				cur = node.left;
			}
		}
		return list;
	}
}