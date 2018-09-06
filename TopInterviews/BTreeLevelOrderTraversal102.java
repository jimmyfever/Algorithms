import java.util.*;
public class BTreeLevelOrderTraversal102 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	// BFS
	public List<List<Integer>> levelOrder(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<List<Integer>> list = new ArrayList<>();

		if(root == null) return list;

		queue.offer(root);
		while(!queue.isEmpty()){
			int level = queue.size();
			List<Integer> sub = new LinkedList<>();
			for(int i = 0; i < level; i++){
				if(queue.peek().left != null){
					queue.offer(queue.peek().left);
				}
				if(queue.peek().right != null){
					queue.offer(queue.peek().right);
				}
				sub.add(queue.poll().val);
			}
			list.add(sub); 
		}
		return list;
	}

	// Recursion
	public List<List<Integer>> levelOrder1(TreeNode root){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		helper(list, root, 0);
		return list;
	}
	private void helper(List<List<Integer>> list, TreeNode root, int height){
		if(root == null) return;
		if(height >= list.size()){
			list.add(new LinkedList<Integer>());
		}
		list.get(height).add(root.val);
		helper(list, root.left, height + 1);
		helper(list, root.right, height + 1);
	}
}