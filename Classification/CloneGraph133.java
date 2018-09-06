import java.util.*;
public class CloneGraph133 {
	
	HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();

	public static void main(String[] args){
		
	}	
	class UndirectedGraphNode {
	    int label;
	    List<UndirectedGraphNode> neighbors;
	    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if(node == null) return null;

		if(map.containsKey(node)){
			return map.get(node);
		}

		UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
		map.put(node, cloneNode);

		for(UndirectedGraphNode nei : node.neighbors){
			cloneNode.neighbors.add(cloneGraph(nei));
		}
		return cloneNode;
	}
}