/*
Given a linked list, determine if it has a cycle in it.

[3,2,0,-4] where lastnode -4 has next to Node 2, then there's a cycle
If lastnode has next pointing to null, then there's no cycle in the list

Solution
Race track. We have two racers, one who move one node at a time and other who moves two nodes at a time.
If the track is a cycle(laps), then eventually they would collide and return true

If it is a destination race, the two racers would never collide and returns false.

*/

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        
        if(head == null) 
            return false;
        
        ListNode marquez = head;
        ListNode rossi = head.next;
        
        while(marquez != rossi){
            if(rossi == null || rossi.next == null)
                return false;
            
            marquez = marquez.next;
            rossi = rossi.next.next;
            
        }
        return true;
    }
}
