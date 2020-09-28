  /*
  This question is asked by Facebook. Given a linked list and a value n, remove the nth to last node and return the resulting list.

  Ex: Given the following linked lists...

  1->2->3->null, n = 1, return 1->2->null
  1->2->3->null, n = 2, return 1->3->null
  1->2->3->null, n = 3, return 2->3->null

  */
package com.dailybyte;

public class RemoveNthToLastNode {

	public static ListNode removeNthToLastNode(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode fast = head;
		ListNode slow = head;
		
		for(int i = 1; i <= n+1; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		
		return dummy.next;
		
	}
}

