import java.util.*;
public class CourseSchedule207 {
	
	

	public static void main(String[] args){
		
	}
	public boolean canFinish(int numCourses, int[][] prerequisites){
		int[][] matrix = new int[numCourses][numCourses];	// pre -> in
		int[] inCourse = new int[numCourses];

		for(int i = 0; i < prerequisites.length; i++){
			int in = prerequisites[i][0];
			int pre = prerequisites[i][1];
			if(matrix[pre][in] == 0){
				inCourse[in]++;
			}
			matrix[pre][in] = 1;
		}
		int count = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < inCourse.length; i++){
			if(inCourse[i] == 0) queue.offer(i); // push course without pre into queue
		}
		while(!queue.isEmpty()){
			int course = queue.poll();
			count++;
			for(int i = 0; i < numCourses; i++){
				if(matrix[course][i] != 0){
					if(inCourse[i]-- == 0){
						queue.offer(i);
					}
				}
			}
		}
		return count == numCourses;	
	}
}