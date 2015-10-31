// https://leetcode.com/discuss/66646/two-simple-iterative-solutions-bfs-and-dfs

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

// weird bug!
public class Solution {
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        return Math.max(dfs(root.left, root.val, 1, 1), dfs(root.right, root.val, 1, 1));
    }
    int dfs(TreeNode root, int pre, int num, int max) {
        if(root == null) return max;
        if(root.val == pre + 1) {
            num++;
            max = num > max ? num : max;
        }
        else{num = 1;} //
        return Math.max(dfs(root.left, root.val, num, max), dfs(root.right, root.val, num, max));
    }
}

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
    int max = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return max;
        max++;
        dfs(root.val, 1, root.left);
        dfs(root.val, 1, root.right);
        return max;
    }
    void dfs(int pre, int num, TreeNode root) {
        if(root == null) {return;}
        if(pre+1 == root.val) {
            num++;
            max = Math.max(num, max);
        }
        else {
            num = 1;//
        }
        dfs(root.val, num, root.left);
        dfs(root.val, num, root.right);
    }
}