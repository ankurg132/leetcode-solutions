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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val > key){
            root.left = deleteNode(root.left,key);
        }
        if(root.val < key){
            root.right = deleteNode(root.right,key);
        }
        if(root.val == key){
            if(root.left != null && root.right != null){
                TreeNode temp = findMin(root.right);
                root.val = temp.val;
                root.right = deleteNode(root.right, temp.val);
            }
            else if(root.left !=null){
                root = root.left;
            }
            else if(root.right !=null){
                root = root.right;
            }
            else{
                System.out.println("SHOULD FIND SEVEN");
                root = null;
            }
        }
        // System.out.println(root.val);
        return root;
    }
    public TreeNode findMin(TreeNode root){
        if(root.left == null){
            return root;
        }
        return findMin(root.left);
    }
}