import java.util.*;
public class FlattenNestedList341 {
	
	

	public static void main(String[] args){
		
	}	
	public interface NestedInteger {
	
	    // @return true if this NestedInteger holds a single integer, rather than a nested list.
	    public boolean isInteger();
	
	    // @return the single integer that this NestedInteger holds, if it holds a single integer
	    // Return null if this NestedInteger holds a nested list
	    public Integer getInteger();
	
	    // @return the nested list that this NestedInteger holds, if it holds a nested list
	    // Return null if this NestedInteger holds a single integer
	    public List<NestedInteger> getList();
	}

	private Stack<NestedInteger> stack;
	private void pushListToStack(List<NestedInteger> nestedList){
		Stack<NestedInteger> tmp = new Stack<>();
		for(NestedInteger nested : nestedList){
			tmp.push(nested);
		}
		while(!tmp.isEmpty()){
			stack.push(tmp.pop());
		}
	}
	public NestedIterator(List<NestedInteger> nestedList){
		stack = new Stack<>();
		pushListToStack(nestedList);
	}

	@Overrides
	public Integer next(){
		if(!hasNext()){
			return null;
		}
		return stack.pop().getInteger();
	}
	@Overrides
	public boolean hasNext(){
		while(!stack.isEmpty() && !stack.peek().isInteger()){
			pushListToStack(stack.pop().getList());
		}
		return !Stack.isEmpty();
	}
}