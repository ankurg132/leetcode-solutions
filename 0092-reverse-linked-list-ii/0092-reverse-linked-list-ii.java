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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode init = null;
        ListNode startPos = head;
        if (head == null || left == right) return head;
        for(int i=0; i < left - 1; i++){
            init = startPos;
            startPos = startPos.next;
        }
        //now init is in pos before list, and startPos is at start of list.
        //now we reverse in right - left
        ListNode prev = null;
        ListNode current = startPos;
        ListNode next = current.next;
        for(int i=0; i < right - left + 1 && current != null; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(init != null){
            init.next = prev;
        }else{
            head = prev;
        }
        startPos.next = current;

        return head;
    }
}