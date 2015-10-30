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
    public List<TreeNode> generateTrees(int n) {
        return dfs(1, n);
    }
    List<TreeNode> dfs(int i, int j) {
        List<TreeNode> list = new LinkedList<TreeNode>();
        if(i > j) {
            list.add(null);
            return list;
        }
        if(i == j) {
            list.add(new TreeNode(i));
            return list;
        }
        for(int k = i; k <= j; k++) { // k <= j
            for(TreeNode tn1 : dfs(i, k-1)) {
                for(TreeNode tn2 : dfs(k+1, j)) {
                    TreeNode node = new TreeNode(k); // k
                    node.left = tn1;
                    node.right = tn2;
                    list.add(node);
                }
            }
        }
        return list;
    }
}