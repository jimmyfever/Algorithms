import java.util.*;
public class BTreePath257 {
	
	

	public static void main(String[] args){
		
	}	
	public List<String> bTreePaths(TreeNode root){
		List<String> ans = new ArrayList<>();
		if(root != null) helper(root, "", ans);
		return ans;
	}
	private void helper(TreeNode root, String path, List<String> ans){
		if(root.left == null && root.right == null) ans.add(path + root.val);
		if(root.left != null) helper(root.left, path + root.val + "->", ans);
		if(root.right != null) helper(root.right, path + root.val + "->", ans);
	}
}