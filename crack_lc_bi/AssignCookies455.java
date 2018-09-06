import java.util.*;
public class AssignCookies455 {
	
	public int findContentChildren(int[] g, int[] s){
		Arrays.sort(g);
		Arrays.sort(s);

		int si = s.length-1, gi = g.length-1;
		int res = 0;

		while(gi >= 0 && si >= 0){
			if(s[si] >= g[gi]){
				res++;
				gi--;
				si--;
			}else {
				gi--;
			}
		}
		return res;      
	}
}