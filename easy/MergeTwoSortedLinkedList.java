/* LeetCode : Problem 21 
Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists.

Brute Force : Start from the beginning of both lists and compare the elements.
              Add the lesser element to the output list and move to next node.
              Return output list
Time complexity : O(a+b) where a & b are lengths of the input lists
                  Linear, fair

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeTwoSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode temp = new ListNode(0);
    ListNode curr = temp;
        
        while ( l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
      }      
            if(l1 != null){
                curr.next = l1;
                l1 = l1.next;
            }
            if(l2 != null){
                curr.next = l2;
                l2 = l2.next;
            }         
        
    return temp.next;
    }
}
