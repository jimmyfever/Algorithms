
public class PathSumIII437 {
	
	

	public static void main(String[] args){
		
	}	
	public int pathSum(TreeNode root, int sum){
		if(root == null) return 0;

		int res = 0;
		res = helper(root, sum);
		res += pathSum(root.left, sum);
		res += pathSum(root.right, sum);
		return res;
	}
	private int helper(TreeNode node, int num){
		if(node == null) return 0;
		int res = 0;
		if(node.val == num){
			res++;
		}
		res += helper(node.left, num - node.val);
		res += helper(node.right, num - node.val);
		return res;
	}
}