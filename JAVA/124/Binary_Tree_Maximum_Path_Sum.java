/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = Math.max(0, dfs(root.left));
        int r = Math.max(0, dfs(root.right));
        
        max = Math.max(max, l + r + root.val);
        return root.val + Math.max(l, r);
    }
}