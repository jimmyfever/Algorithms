import java.util.*;
public class FindAllAna438 {
	
	

	public static void main(String[] args){
		
	}	
	public List<Integer> findAna(String s, String p){
		List<Integer> list = new ArrayList<>();
		if(s == null || s.length() == 0 || p == null || p.length() == 0) return list;

		int[] containP = new int[256];
		for(char c : p.toCharArray()){
			containP[c]++;
		}

		int l = 0, r = 0, count = p.length();
		while(r < s.length()){
			if(containP[s.charAt(r++)]-- >= 1) count--;
			if(count == 0) list.add(l);
			if(r - l == p.length() && containP[s.charAt(l++)]++ >= 0) count++;
		}
		return list;

	}
}