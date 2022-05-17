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
    public boolean isSymmetric(TreeNode root) {
        TreeNode p = root.left;
        TreeNode q = root.right;
        return treeSymmetric(p,q);
    }
    
    public boolean treeSymmetric(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return (p.val == q.val) && treeSymmetric(p.left, q.right) && treeSymmetric(p.right, q.left);
    }
}