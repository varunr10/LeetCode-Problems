/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2->3->3->4->5->5
Output: 1->2->3->4->5

*/
public class RemoveDuplicateInSortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        
        while(current!=null && current.next != null){
            if(current.val == current.next.val) {
               current.next= current.next.next;
            }
            else{
               current = current.next; 
            }
            
        }
        return head;
    }
}
