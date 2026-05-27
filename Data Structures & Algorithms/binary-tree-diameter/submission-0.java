
class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int le = height(node.left);
        int rt = height(node.right);

        maxDiameter = Math.max(maxDiameter, le + rt);
        return 1 + Math.max(le, rt);
    }

}