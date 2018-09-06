import java.util.*;
public class BTInorder94 {
	
	

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
		List<Integer> list = new ArrayList<>();

		TreeNode cur = root;
		while(cur != null && !stack.empty()){
			if(cur != null){
				stack.push(cur);
				cur = cur.left;
			}else{
				cur = stack.pop();
				list.add(cur.val);
				cur = cur.right;
			}
		}
		return list;
	}
}