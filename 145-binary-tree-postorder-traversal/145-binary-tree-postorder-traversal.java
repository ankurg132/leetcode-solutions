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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root!=null)
            helper(ans,root);
        return ans;
    }
    public void helper(List<Integer> ans, TreeNode root){
        if(root.left!=null)
            helper(ans,root.left);
        if(root.right!=null)
            helper(ans,root.right);
        ans.add(root.val);
    }
}