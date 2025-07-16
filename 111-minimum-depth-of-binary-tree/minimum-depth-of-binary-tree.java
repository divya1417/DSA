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
    public int minDepth(TreeNode root) {
        return Height(root);
    }

    public int Height(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) return Height(root.right) + 1;
        if (root.right == null) return Height(root.left) + 1;
        return Math.min(Height(root.left), Height(root.right)) + 1;
    }
}