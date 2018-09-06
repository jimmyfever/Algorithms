import java.util.*;
public class MaxDepthOfBTree104 {
	
	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public int maxDepth1(TreeNode root){
		if(root == null) return 0;

		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> value = new Stack<>();
		stack.push(root);
		value.push(1);
		int max = 0;
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			int tmp = value.pop();
			max = Math.max(tmp, max);
			if(node.left != null){
				stack.push(node.left);
				value.push(tmp + 1);
			}
			if(node.right != null){
				stack.push(node.right);
				value.push(tmp + 1);
			}
		}
		return max;
	}	
}