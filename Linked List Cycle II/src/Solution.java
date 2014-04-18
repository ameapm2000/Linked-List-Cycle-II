
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class Solution {

	public static void main(String[] args) 
	{
		ListNode l = new ListNode(1);
		ListNode l1 = new ListNode(2);
		l.next = l1;
		ListNode l2 = new ListNode(3);
		l1.next = l2;
		ListNode l3 = new ListNode(4);
		l2.next = l3;
		ListNode l4 = new ListNode(5);
		l3.next = l4;
		l4.next = l1;
		System.out.println(hasCycle(l).val);
	}
	
	public static ListNode hasCycle(ListNode head) 
	{
		if(head == null)
			return null;
		
		ListNode slow,fast;
		slow = fast = head;
		
		while(true)
		{
			slow = slow.next;
			
			if(fast.next != null)
				fast = fast.next.next;
			else
				return null;
			
			if(slow == null || fast == null)
				return null;
			
			if(slow == fast)
				break;
		}
		
		slow = head;
		while(slow!=fast)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
		
	}

}
