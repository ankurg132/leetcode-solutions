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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode mid = head;
        ListNode curr = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            curr = mid;
            mid = mid.next;
        }
        System.out.println(mid.val);
        ListNode prev = null;
        ListNode current = mid;

        while (current != null) {
            ListNode next = current.next; // Store next node safely inside loop
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode head2 = head;
        while(prev != null && head2 != null){
            if(prev.val != head2.val){
                return false;
            }
            prev = prev.next;
            head2 = head2.next;

        }
        return true;

    }
}