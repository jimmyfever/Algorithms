import java.util.*;
public class BTreeZigzagLevelOrderTraversal103 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public List<List<Integer>> zigzag(TreeNode root){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if(root == null) return list;

		queue.offer(root);

		int level = -1;

		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> sub = new ArrayList<Integer>();

			for(int i = 0; i < size; i++){
				TreeNode node = queue.poll();
				sub.add(node.val);

				if(node.left != null) queue.offer(node.left);
				if(node.right != null) queue.offer(node.right);
			}

			level += 1;
			if(level % 2 == 1){
				Collections.reverse(sub);
			}
			list.add(sub);
		}
		return list;
	}
}