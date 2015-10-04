
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
        treeStack.push(root);
        while(!treeStack.isEmpty()) {
            TreeNode node = treeStack.pop();
            if(node != null) {
                result.add(node.val);
                treeStack.push(node.right);
                treeStack.push(node.left);
            }
        }
        return result;
    }
}