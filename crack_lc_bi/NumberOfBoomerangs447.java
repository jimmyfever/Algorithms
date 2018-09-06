import java.util.*;
public class NumberOfBoomerangs447 {
	
	

	public static void main(String[] args){
		
	}	
	public int numberOfBoomerangs(int[][] points){
		int res = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < points.length; i++){
			for(int j = 0; j < points[0].length; i++){
				if(i == j) continue;

				int d = getDis(points[i], points[j]);
				map.put(d, map.getOrDefault(d, 0)+1);
			}
			for(int val : map.values()){
				res += val*(val-1);
			}
			map.clear();
		}
		return res;
	}
	private int getDis(int[] a, int[] b){
		return (a[0] - b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
	}
}