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
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode last = dummy;
        //step 1: iterate while current != null

        //step 2: reverse each k items

        //step 3: connect the prev to the start of the next item
        while(current != null){
            ListNode countNode = current;
            boolean hasKNodes = false;
            for(int i=0; i < k; i++){
                if(countNode == null){
                    hasKNodes = true;
                    break;
                }
                countNode = countNode.next;
            }
            if(hasKNodes){
                last.next = current;
                break;
            }
            ListNode prev = null;
            ListNode newEnd = current;
            for(int i=0; i < k && current != null; i++){
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            last.next = prev;
            newEnd.next = current;
            last = newEnd;
        }
        return dummy.next;
    }
}