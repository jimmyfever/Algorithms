import java.util.*;
public class KthInBST230 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public int kthSmallest(TreeNode root, int k){
		Map<TreeNode, Integer> numOfChildren = new HashMap<>();
		countNodes(root, numOfChildren);
		return quickSelect(root, k, numOfChildren);
	}
	private int countNodes(TreeNode root, Map<TreeNode, Integer> numOfChildren){
		if(root == null) return 0;

		int left = countNodes(root.left, numOfChildren);
		int right = countNodes(root.right, numOfChildren);
		numOfChildren.put(root, left + right + 1);
		return left + right + 1;
	}
	private int quickSelect(TreeNode root, int k, Map<TreeNode, Integer> numOfChildren){
		if(root == null) return -1;

		int left = root.left == null ? 0 : numOfChildren.get(root.left);
		if(left >= k){
			return quickSelect(root.left, k, numOfChildren);
		}
		if(left + 1 == k) return root.val;

		return quickSelect(root.right, k - left - 1, numOfChildren);
	}
	// recursive
	int count = 0;
	int res = Integer.MIN_VALUE;
	public int kthSmallestII(TreeNode root, int k){
		traverse(root, k);
		return res;
	}
	public void traverse(TreeNode root, int k){
		if(root == null) return;
		traverse(root.left, k);
		count++;
		if(count == k) res = root.val;
		traverse(root.right, k);
	}
	// iterative
	public int kthSmallestIII(TreeNode root, int k){
		Stack<TreeNode> stack = new Stack<>();
		TreeNode p = root;
		int count = 0;
		while(!stack.isEmpty() || p != null){
			if(p != null){
				stack.push(p);
				p = p.left;
			}else{
				TreeNode node = stack.pop();
				count++;
				if(count == k) return node.val;
				p = node.right;
			}
		}
		return Integer.MIN_VALUE;
	}

}