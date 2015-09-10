// preorder traversal don't need to put left node into stack
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> treeStack = new Stack<TreeNode>();
        List<Integer> result = new LinkedList<Integer>();
        TreeNode node = root;
        while(!treeStack.isEmpty() || node != null) {
            if(node != null) {
                result.add(node.val);
                treeStack.push(node.right);
                node = node.left;
            }
            else {
                node = treeStack.pop();
            }
        }
        return result;
    }
}