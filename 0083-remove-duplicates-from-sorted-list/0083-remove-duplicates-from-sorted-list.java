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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode answer = head;
        while(answer != null && answer.next != null){
            if(answer.val == answer.next.val){
                answer.next = answer.next.next;
            }else{
                answer = answer.next;
            }
        }
        return head;
    }
}