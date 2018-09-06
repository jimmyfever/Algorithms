
public class ContainerWithMostWater11 {
	
	

	public static void main(String[] args){
		
	}	
	public int maxArea(int[] height){
		if(height == null || height.length == 0) return 0;
		int l = 0, r = height.length - 1;
		int ans = 0;
		while(l < r){
			ans = Math.max(ans, area(l, r, height));
			if(height[l] <= height[r]) l++;
			else r--;
		}
		return ans;
	}
	private int area(int l, int r, int[] h){
		return (r-l)*Math.min(h[l], h[r]);
	}
}