import java.util.*;
public class BTLevelorderII107 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public List<List<Integer>> levelorderII(TreeNode root){
 		List<List<Integer>> list = new ArrayList<>();

 		if(root == null) return list;

 		Queue<TreeNode> queue = new LinkedList<TreeNode>();

 		queue.offer(root);
 		while(!queue.isEmpty()){
 			ArrayList<Integer> level = new ArrayList<>();
 			int size = queue.size();
 			for(int i = 0; i < size; i++){
 				TreeNode head = queue.poll();
 				level.add(head.val);
 				if(head.left != null){
 					queue.offer(head.left);
 				}
 				if(head.right != null){
 					queue.offer(head.right);
 				}
 			} //for
 			list.add(level);

 		}
 		Collections.reverse(list);
 		return list;
 	}
}