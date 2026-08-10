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
                ListNode temp = head;
                while(temp!=slow){
                    temp = temp.next;
                    slow = slow.next;
                };
                return temp;
            }
        }
        return null;

    }
}