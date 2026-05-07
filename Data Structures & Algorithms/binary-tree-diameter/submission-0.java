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
    int res = 0;

    public int getHight(TreeNode t) {
        if (t == null) {
            return 0;
        }

        int left = getHight(t.left);
        int right = getHight(t.right);

        res = Math.max(left + right, res);
        return Math.max (left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        getHight(root);
        return res;
    }
}
