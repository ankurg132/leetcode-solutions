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
    static int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        sum = getSum(root);
        return sum;
    }
    public int getSum(TreeNode root){
        // System.out.println("EXEC FOR "+root.val);
        // System.out.println("SUM INIT"+sum);
        if(root!=null && root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
            // System.out.println(root.left.val);
            // System.out.println("SUM INSIDE"+sum);
            // return sum;
        }
        if(root.left!=null){
        getSum(root.left);   
        }
        if(root.right!=null){
         
        getSum(root.right);   
        }
        // System.out.println("SUM LAST"+sum);
        return sum;
        // return 10;
    }
}