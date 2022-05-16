/*
Given a singly linked list, group all odd nodes together followed by the even nodes. 
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:
Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL

Example 2:
Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL

Brute Force : Delink Odd and Even items in two seperate linked list and join them in the end
Space Complexity O(n), bad, not as expected

Optimal Solution: Delink even items from the main list. Such that only Odd elements are left in the list. 
Then link Even after Odd list in the end
Space Complexity O(1), since we are doing it in-place

*/


class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        
        ListNode odd = head;
        ListNode even = head.next;
        //To Link Even after Odd in the ending
        ListNode evenHead = even;
        
        while(even != null && even.next != null){
            
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;            
        }
        odd.next = evenHead;
        return head;
    }
}
