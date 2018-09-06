import java.util.*;
public class PathSumII113 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public List<List<Integer>> pathSum(TreeNode root, int sum){
 		List<List<Integer>> res = new LinkedList<>();
 		List<Integer> cur = new LinkedList<>();
 		helper(root, sum, cur, res);
 		return res;

 	}
 	private void helper(TreeNode root , int sum, List<Integer> cur, List<List<Integer>> res){
 		if(root == null) return;

 		cur.add(root.val);
 		if(root.left == null && root.right == null && sum == root.val){
 			res.add(new LinkedList<Integer>(cur));
 			cur.remove(cur.size() - 1);
 			return;
 		}else{
 			helper(root.left, sum - root.val, cur, res);
 			helper(root.right, sum - root.val, cur, res);
 			cur.remove(cur.size() - 1);
 			return;
 		}
 	}
}