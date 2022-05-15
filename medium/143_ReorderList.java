/*
[1,2,3,4,5]
[1,5,2,4,3]
Step1: Split the linked list into two halves by finding the middle using fast/slow pointers.
	First half = 1,2,3
	Second half = 4,5
Step2: Reverse the second half
	Second half = 5,4

Step3: Traverse both lists together and merge both the lists
	First Half = 1,2,3
	Second half = 5,4

Output = [1,5,2,4,3]

*/
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

		mergeTwoLinkedLists(head, list2);
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

	public static void mergeTwoLinkedLists(ListNode list1, ListNode list2) {
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
