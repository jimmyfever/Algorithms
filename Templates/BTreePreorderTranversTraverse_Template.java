import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class BTreePreorderTranversTraverse_Template {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// Iterative
	public List<Integer> preorderTraversal_Iter(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> preorder = new ArrayList<>();

		if(root == null){
			return preorder;
		}

		stack.push(root);
		while(!stack.empty()){
			TreeNode node = stack.pop();
			preorder.add(node.val);
			if(node.right != null){
				stack.push(node.right);
			}
			if(node.left != null){
				stack.push(node.left);
			}
		}
		return preorder;
	}
	// Traverse
	public ArrayList<Integer> preorderTraversal(TreeNode root){
		ArrayList<Integer> result = new ArrayList<>();
		traverse(root, result);

		return result;
	}
	private void traverse(TreeNode root, ArrayList<Integer> result){
		if(root == null){
			return;
		}

		result.add(root.val);
		traverse(root.left, result);
		traverse(root.right, result);
	}
	// Divide & Conquer
	public ArrayList<Integer> preorderTraversal_DC(TreeNode root){
		ArrayList<Integer> result = new ArrayList<>();
		//null or leaf
		if(root == null){
			return result;
		}

		// Divide
		ArrayList<Integer> left = preorderTraversal_DC(root.left);
		ArrayList<Integer> right = preorderTraversal_DC(root.right);

		// Conquer
		result.add(root.val);
		result.addAll(left);
		result.addAll(right);
		return result;
	}
}