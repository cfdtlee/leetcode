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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode p = root;
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(p != null || !stack.isEmpty()) {
            if(p != null) {
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }
        }
        return list;
    }
}