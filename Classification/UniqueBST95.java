import java.util.*;
public class UniqueBST95 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public ArrayList<TreeNode> generateTrees(int n){
		return helper(1, n);
	}
	private ArrayList<TreeNode> helper(int start, int end){
		ArrayList<TreeNode> res = new ArrayList<>();

		if(start > end){
			res.add(null);
			return res;
		}

		for(int i = start; i <= end; i++){
			ArrayList<TreeNode> left = helper(start, i - 1);
			ArrayList<TreeNode> right = helper(i + 1, end);
			for(TreeNode l : left){
				for(TreeNode r : right){
					TreeNode root = new TreeNode(i);
					root.left = l;
					root.right = r;
					res.add(root);
				}
			}
		}
		return res;
	}
}