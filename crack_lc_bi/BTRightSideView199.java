import java.util.*;
public class BTRightSideView199 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public List<Integer> rightSideView(TreeNode root){
 		List<Integer> list = new ArrayList<>();
 		if(root == null) return list;

 		Queue<TreeNode> queue = new LinkedList<>();
 		queue.offer(root);
 		while(!queue.isEmpty()){
 			int size = queue.size();
 			for(int i = 0; i < size; i++){
 				TreeNode head = queue.poll();
 				if(i == 0) list.add(head.val);
 				if(head.right != null) queue.offer(head.right);
 				if(head.left != null) queue.offer(head.left);
 			}
 		}
 		return list;
 	}
}