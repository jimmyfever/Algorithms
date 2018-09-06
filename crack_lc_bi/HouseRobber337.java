import java.util.*;
public class HouseRobber337 {
	
	public int rob(TreeNode root){
		return helper(root, new HashMap<TreeNode, Integer>());
	}
	private int helper(TreeNode root, Map<TreeNode, Integer> map){
		if(root == null) return 0;
		if(map.containsKey(root)) return map.get(root);

		int max = 0;

		if(root.left != null){
			max += helper(root.left.left, map) + 
					helper(root.left.right, map);
		}
		if(root.right != null){
			max += helper(root.right.left, map) +
					helper(root.right.right, map);
		}
		max = Math.max(max + root.val, 
				helper(root.left, map) + helper(root.right, map));
		map.put(root, max);

		return max;
	}
}