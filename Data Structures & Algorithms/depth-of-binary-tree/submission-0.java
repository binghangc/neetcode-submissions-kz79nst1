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
    public int maxDepth(TreeNode root) {
        return depthFirstSearch(root, 0);
    }

    public int depthFirstSearch(TreeNode root, int count) {
        if (root == null) {
            return count;
        }

        return Math.max(depthFirstSearch(root.left, count + 1), depthFirstSearch(root.right, count + 1));
    }
}
