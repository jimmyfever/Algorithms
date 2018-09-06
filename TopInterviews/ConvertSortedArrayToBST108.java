
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
		if(nums.length == 0 || nums == null) return null;
		TreeNode head = helper(nums, 0, nums.length - 1);
		return head;

	}
	private TreeNode helper(int[] nums, int lo, int hi){
		if(lo > hi) return null;

		int mid = lo + (hi - lo) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, lo, mid - 1);
		node.right = helper(nums, mid + 1, hi);
		return node;
	}
}