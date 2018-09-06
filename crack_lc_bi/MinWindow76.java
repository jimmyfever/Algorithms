
public class MinWindow76 {
	
	

	public static void main(String[] args){
		
	}
	public String minWindow(String s, String t){
		int[] hash = new int[256];
		for(char c : t.toCharArray()){
			hash[c]++;
		}
		int count = t.length(), l = 0, r = 0, len = Integer.MAX_VALUE, head = 0;
		while(r < s.length()){
			if(hash[s.charAt(r++)]-- > 0) count--;
			while(count == 0){
				if(r - l < len) len = r - (head = l);
				if(hash[s.charAt(l++)]++ == 0) count++;
			}
		}
		return len == Integer.MAX_VALUE ? "" : s.substring(head, head+len);
	}	
}