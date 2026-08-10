/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // step 1: find length of circular linked list
        int length = 0;
        ListNode fast = head;
        boolean isCycle = false;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isCycle = true;
                ListNode temp = slow;
                do{
                    length++;
                    temp = temp.next;
                }while(temp != slow);
                break;
            }
        }

        if(!isCycle){
            return null;
        }

        //length is found.
        
        ListNode f = head;
        ListNode s = head;
        for(int i=0; i < length; i++){
            s = s.next;
        }
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return f;

    }
}