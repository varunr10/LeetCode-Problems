package linkedlists;

public class ReorderList {
	public static void reorderList(ListNode head) {
		if(head == null || head.next == null)
			return;

		ListNode fast = head;
		ListNode slow = fast;
		ListNode prev = null;
		while(fast != null && fast.next != null) {
			prev = slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		prev.next = null;

		ListNode list2 = reverseLinkedList(slow);

		mergeTwoSortedLinkedLists(head, list2);
	}

	public static ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null, next = null;
		ListNode curr = head;

		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	} 

	public static void mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
		while(list1 != null) {
			ListNode one_next = list1.next;
			ListNode two_next = list2.next;

			list1.next = list2;
			
			if(one_next == null) {
                break;
            }
			
			list2.next = one_next;

			list1 = one_next;
			list2 = two_next;

		}
	}
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five= new ListNode(5);

		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = null;
		
		reorderList(one);
	}
}
