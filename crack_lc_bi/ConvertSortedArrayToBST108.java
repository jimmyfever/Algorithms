
public class ConvertSortedArrayToBST108 {
	
	

	public static void main(String[] args){
		
	}	
	public TreeNode sortedArrayToBST(int[] nums){
		if(nums == null) return null;

		return helper(nums, 0, nums.length - 1);
	}
	private TreeNode helper(int[] nums, int start, int end){
		if(start > end) return null;

		int mid = start + (end - start)/2;
		TreeNode node = new TreeNode(nums[mid]);
		TreeNode left = helper(nums, start, mid - 1);
		TreeNode right = helper(nums, mid + 1, end);

		node.left = left;
		node.right = right;
		return node;
	}
}