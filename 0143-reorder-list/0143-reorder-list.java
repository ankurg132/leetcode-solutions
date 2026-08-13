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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        //step 1: find middle
        ListNode fast = head;
        ListNode mid = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            mid = mid.next;
        }
        //step 2: reverse the elements after mid
        ListNode prev = null;
        ListNode current = mid;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode headFirst = head;
        ListNode headSecond = prev;
        //Step3 : merge
        while(headSecond != null && headFirst != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }
        if(headFirst != null){
            headFirst.next = null;
        }


    }
}