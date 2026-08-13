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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        // 1. Calculate list length and locate the original tail
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        // 2. Handle cases where rotation count is a multiple of length
        int kEffective = k % length;
        if (kEffective == 0) {
            return head;
        }

        // 3. Connect original tail to head to form a ring
        last.next = head;

        // 4. Find new tail: (length - kEffective - 1) steps from head
        ListNode newLast = head;
        for (int i = 0; i < length - kEffective - 1; i++) {
            newLast = newLast.next;
        }

        // 5. Set new head and break the ring
        head = newLast.next;
        newLast.next = null;

        return head;
    }
    
}