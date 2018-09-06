import java.util.*;
public class RemoveLinkedListEle203 {
	
	public ListNode removeElement(ListNode head, int val, int depth){
		/*
		// solution1
		while(head != null && head.val == val){
			ListNode delNode = head;
			head = head.next;
			delNode.next = null;
		}

		if(head == null)
			return head;

		ListNode prev = head;
		while(prev.next != null){
			if(prev.next.val == val){
				ListNode delNode = prev.next;
				prev.next = delNode.next;
				delNode.next = null;
			}
			else{
				prev = prev.next;
			}
		}
		return head;
		
		// solution2
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;

		ListNode prev = dummyHead;
		while(prev.next != null){
			if(prev.next.val == val){
				prev.next = prev.next.next;
			}else{
				prev = prev.next;
			}
		}
		return dummyHead.next;
		*/
		// solution3
		String depthString = generatedepthString(depth);
		System.out.print(depthString);
		System.out.println("Call: remove " + val + " in " + head);
		if(head == null){
			System.out.print(depthString);
			System.out.println("Return: " + head);
			return head;
		}
		ListNode res = removeElement(head.next, val, depth+1);
		System.out.print(depthString);
		System.out.println("After remove " + val + ": " + res);
		
		ListNode ret;
		if(head.val == val)
			ret = res;
		else{
			head.next = res;
			ret = head;
		}
		System.out.print(depthString);
		System.out.println("Return: " + ret);
		return ret;
	}
	private static String generatedepthString(int depth){
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < depth; i++){
			res.append("--");
		}
		return res.toString();
	}
	public static void main(String[] args) {
		
		int[] nums = {1,2,6,3,4,5,6};
		ListNode head = new ListNode(nums);
		System.out.println(head);

		ListNode res = (new RemoveLinkedListEle203()).removeElement(head, 6, 0);
		System.out.println(res);
	}
}