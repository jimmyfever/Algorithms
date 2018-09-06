import java.util.*;
public class Main {

	private static double testQueue(Queue<Integer> q, int opCount) {
		long startTime = System.nanoTime();
		
		Random random = new Random();
		for(int i = 0; i < opCount; i++) {
			q.enqueue(random.nextInt(Integer.MAX_VALUE));
		}
		for(int i = 0; i < opCount; i++) {
			q.dequeue();
		}
		long endTime = System.nanoTime();
		
		return (endTime - startTime) / 1000000000.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<Integer> queue = new ArrayQueue<>();
		for(int i = 0; i < 10; i++) {
			queue.enqueue(i);
			System.out.println(queue);
			
			if(i%3 == 2) {
				queue.dequeue();
				System.out.println(queue);
			}
		}
		System.out.println("------------------------");
		LoopQueue<Integer> lqueue = new LoopQueue<>();
		for(int i = 0; i < 10; i++) {
			lqueue.enqueue(i);
			System.out.println(lqueue);
			
			if(i%3 == 2) {
				lqueue.dequeue();
				System.out.println(lqueue);
			}
		}
		
		System.out.println("------------------------");
		int opCount = 100000;
		ArrayQueue<Integer> aq = new ArrayQueue<>();
		double time1 = testQueue(aq, opCount);
		System.out.println("ArrayQueue, time: " + time1 + "s");
		
		LoopQueue<Integer> lq = new LoopQueue<>();
		double time2 = testQueue(lq, opCount);
		System.out.println("LoopQueue, time: " + time2 + "s");

	}
}
