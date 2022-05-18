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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static ListNode p;
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        p = head;
        int len = getLen(head);
        System.out.println(len);
        return getAns(0,len-1);
    }
    
    public int getLen(ListNode node){
        int count = 1;
        while(node.next != null){
            count++;
            node = node.next;
        }
        return count;
    }
    public TreeNode getAns(int start, int end){
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode left = getAns(start, mid - 1);
		TreeNode root = new TreeNode(p.val);
		p = p.next;
		TreeNode right = getAns(mid + 1, end);
		root.left = left;
		root.right = right;
        return root;
    }
}