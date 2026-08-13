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
        ListNode fast = head;
        ListNode mid = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            mid = mid.next;
        }
        //reverse the list after mid
        ListNode prev = null;
        ListNode current = mid;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode headSecond = prev;
        ListNode headFirst = head;
        while(headSecond != null){
            if(headFirst.val != headSecond.val){
                return false;
            }
            headFirst = headFirst.next;
            headSecond = headSecond.next;
        }
        return true;
    }
}