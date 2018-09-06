import java.util.*;
public class Combinations77 {
	
	private List<List<Integer>> list;

	public static void main(String[] args){
		int n = 4, k = 2;
		System.out.println(combine(n,k));
	}
	public static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> list = new ArrayList<>();
        if(n<=0 || k<=0 || k > n) return list;
        
        List<Integer> cur = new ArrayList<>();
        helper(n, k, 1, cur, list);
        return list;
    }
    private static void helper(int n, int k, int index, List<Integer> cur, List<List<Integer>> list){
        if(k == cur.size()){
        	//System.out.println(cur);
            list.add(new ArrayList<Integer>(cur)); // ********
            return;
        }
        for(int i=index; i <= n-(k-cur.size())+1; i++){
            cur.add(i);
            //System.out.println(cur);
            helper(n, k, i+1, cur, list);
            cur.remove(cur.size()-1);
            //System.out.println(cur);
        }
        return;
	}
}