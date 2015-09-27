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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode t = root;
        if(root == null) {
            return result;
        }
        while(!stack1.empty() || t != null) {
            if(t != null) {
                stack2.push(t);
                stack1.push(t.left);
                t = t.right;
            }
            else {
                t = stack1.pop();
            }
        }
        while(!stack2.empty()) {
            result.add(stack2.pop().val);
        }
        return result;
    }
}