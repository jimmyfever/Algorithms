
public class IsSubsequence392 {
	
	public boolean isSub(String s, String t){
		if(s.length() == 0) return true;

		int si = 0, ti = 0;
		while(ti < t.length()){
			if(t.charAt(ti) == s.charAt(si))
				si++;
				if(si == s.length()) return true;
			ti++;
		}
		return false;
	}
}