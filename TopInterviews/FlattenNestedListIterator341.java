import java.util.*;

public class NestedIterator implements Iterator<Integer> {

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

    public NestedIterator(List<NestedInteger> nestedList) {
    	stack = new Stack<>();
    	pushListToStack(nestedList);
    }

    @Override
    public Integer next() {
        if(!hasNext()){
        	return null;
        }
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stack.isEmpty() && !stack.peek().isInteger()){
        	pushListToStack(stack.pop().getList());
        }
        return !stack.isEmpty();
    }
}
