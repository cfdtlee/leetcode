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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        return Math.abs(dfs(root.left) - dfs(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }
    int dfs(TreeNode root) {
        if(root == null) return 0;
        return Math.max(dfs(root.left), dfs(root.right)) + 1;
    }
}