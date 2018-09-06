import java.util.*;

public class CourseScheduleII210 {
	
	

	public static void main(String[] args){
		
	}	
	public int[] findOrder(int numCourses, int[][] prerequisites){

		// each node is a course
		// idx is the course lable
		// inDegree means the # of edges point to it
		// outEdge: point to other courses
		class Node{
			int idx;
			int inDegree;
			List<Integer> outEdge;

			Node(int idx){
				inDegree = 0;
				this.idx = idx;
				outEdge = new ArrayList<>();
			}
		}

		// init
		List<Node> graph = new ArrayList<>();
		for(int i = 0; i < numCourses; i++){
			graph.add(new Node(i));
		}

		// construct the edge for each node
		for(int i = 0; i < prerequisites.length; i++){
		int pre = prerequisites[i][1];
		int cur = prerequisites[i][0];

		graph.get(pre).outEdge.add(cur);
		graph.get(cur).inDegree++;
		}

		// add no in coming edge node to queue
		Queue<Node> q = new ArrayDeque<>();
		for(int i = 0; i < graph.size(); i++){
			if(graph.get(i).inDegree == 0){
				q.offer(graph.get(i));
			}
		}

		int p = 0;
		int[] res = new int[numCourses];
		while(!q.isEmpty()){
			Node n = q.poll();
			res[p++] = n.idx;

			for(int i = 0; i < n.outEdge.size(); i++){
				Node next = graph.get(n.outEdge.get(i));
				next.inDegree--;
				// when in coming edge number is 0 add this course into queue
				if(next.inDegree == 0){
					q.offer(next);
				}
			}
		} // end while

		return p == numCourses ? res : new int[0];
	}
}