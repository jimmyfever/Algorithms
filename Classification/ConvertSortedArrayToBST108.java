
public class ConvertSortedArrayToBST108 {
	
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public TreeNode convert(int[] nums){
		if(nums == null || nums.length == 0) return null;

		return helper(nums, 0, nums.length - 1);
	}
	private TreeNode helper(int[] nums, int start, int end){
		if(start > end) return null;

		TreeNode node = new TreeNode(nums[(start + end) / 2]);
		node.left = helper(nums, start, (start+end)/2 - 1);
		node.right = helper(nums, (start+end)/2 + 1, end);
		return node;
	}
}