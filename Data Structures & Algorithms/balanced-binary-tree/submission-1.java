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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode rt = root.right;
        TreeNode le = root.left;

        if (Math.abs(height(rt) - height(le)) > 1) {
            return false;
        }
      

        return isBalanced(rt) && isBalanced(le);


     
    }

    public int height(TreeNode root){
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.right), height(root.left));
    }
}
