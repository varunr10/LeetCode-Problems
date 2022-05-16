/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
  * Example:

 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 
 Algorithm

Just like how you would sum two numbers on a piece of paper, we begin by summing the least-significant digits,which is the head of l1l1 and l2l2.
Since each digit is in the range of 0 to 9, summing two digits may "overflow". 

For example 5 + 7 = 12. In this case, we set the current digit to 2 and bring over the carry = 1 to the next iteration. 
carry must be either 0 or 1 because the largest possible sum of two digits (including the carry) is 9 + 9 + 1 = 19.
 
Time Complexity : O(m+n) where m & n are lengths of two linkedlist
Space Complexity : O(m+n)+1 where m & n are elements of two linkedlist and + 1 is to store the dummy
 
 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       int carry = 0;
       ListNode p, dummy = new ListNode(0);
       p = dummy;       
        
       while ( l1 != null || l2 != null ){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
              carry += l2.val;
                l2 = l2.next;
            }
           p.next = new ListNode(carry % 10);
           carry /= 10;
           p = p.next;
           
        }
        return dummy.next;
    }
}
