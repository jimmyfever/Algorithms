import java.util.*;
public class CopyListWithRandomPointer138 {
	
	

	public static void main(String[] args){
		
	}	
	class RandomListNode {
	    int label;
	    RandomListNode next, random;
	    RandomListNode(int x) { this.label = x; }
	}
	public RandomListNode copy(RandomListNode head){
		if(head == null){
			return head;
		}
		copyNext(head);
		copyRandom(head);
		return splitList(head);
	}
	private void copyNext(RandomListNode head){	// 1 → 1' → 2 → 2'
		while(head != null){
			RandomListNode newNode = new RandomListNode(head.label);
			newNode.random = head.random;
			newNode.next = head.next;
			head.next = newNode;
			head = head.next.next;
		}
	}
	private void copyRandom(RandomListNode head){
		while(head != null){
			if(head.next.random != null){
				head.next.random = head.random.next;
			}
			head = head.next.next;
		}
	}
	private RandomListNode splitList(RandomListNode head){
		RandomListNode newHead = head.next;
		while(head != null){
			RandomListNode tmp = head.next;
			head.next = tmp.next;
			head = head.next;
			if(tmp.next != null){
				tmp.next = tmp.next.next;
			}
		}
		return newHead;
	}
}