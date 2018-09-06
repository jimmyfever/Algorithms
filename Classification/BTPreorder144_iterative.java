import java.util.*;
public class BTPreorder144_iterative {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public List<Integer> preorder(TreeNode root){
 		Stack<TreeNode> stack = new Stack<>();
 		List<Integer> list = new ArrayList<>();

 		TreeNode cur = root;
 		while(cur != null || !stack.empty()){
 			if(cur != null){
 				stack.push(cur.left);
 				list.add(cur.val);
 				cur = cur.left;
 			}else{
 				cur = stack.pop();
 				cur = cur.right;
 			}
 		}
 		return list;
 	}	
}