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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
        BFS(listOfList, 0, root);
        return listOfList;
    }
    void BFS(List<List<Integer>> lol, int height, TreeNode root) {
        if(root == null) {
            return;
        }
        if(height >= lol.size()) {
            lol.add(new LinkedList<Integer>());
        }
        lol.get(height).add(root.val);
        BFS(lol, height + 1, root.left);
        BFS(lol, height + 1, root.right);
    }
}