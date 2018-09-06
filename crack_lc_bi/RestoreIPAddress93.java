import java.util.*;
public class RestoreIPAddress93 {
	
	

	public static void main(String[] args){
		
	}	
	public List<String> restoreIP(String s){
		List<String> res = new ArrayList<>();
		List<String> list = new ArrayList<>();
		if(s.length() < 4 || s.length() > 12){
			return res;
		}
		helper(res, list, s, 0);
		return res;
	}
	private void helper(List<String> res, List<String> list, String s, int index){
		if(list.size() == 4){
			if(index != s.length()){
				return;
			}
			StringBuffer sb = new StringBuffer();
			for(String tmp : list){
				sb.append(tmp);
				sb.append(".");
			}
			sb.deleteCharAt(sb.length()-1);
			res.add(sb.toString());
			return;
		}
		for(int i = index; i < s.length() && i < index+3; i++){
			String tmp = s.substring(index, i+1);
			if(isValid(tmp)){
				list.add(tmp);
				helper(res, list, s, i+1);
				list.remove(list.size()-1);
			}
		}
	}
	private boolean isValid(String s){
		if(s.charAt(0) == '0'){
			return s.equals("0");
		}
		int digit = Integer.valueOf(s);
		return digit >= 0 && digit <= 255;
	}
}