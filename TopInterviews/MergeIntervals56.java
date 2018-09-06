import java.util.*;
public class MergeIntervals56 {
	
	

	public static void main(String[] args){
		
	}
	public class Interval {
	    int start;
	    int end;
	    Interval() { start = 0; end = 0; }
	    Interval(int s, int e) { start = s; end = e; }
	}
	public List<Interval> merge(List<Interval> intervals){
		if(intervals.size() <= 1) return intervals;

		// sort by ascending starting point using a lambda comparator(java8)
		intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));

		List<Interval> res = new LinkedList<>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;

		for(Interval i : intervals){
			if(i.start <= end){
				end = Math.max(end, i.end);
			}else{
				res.add(new Interval(start, end));
				start = i.start;
				end = i.end;
			}
		}
		res.add(new Interval(start, end));
		return res;
	}	
}