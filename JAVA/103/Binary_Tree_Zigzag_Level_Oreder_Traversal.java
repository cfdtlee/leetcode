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
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {return lol;}
        bfs(root, 0);
        return lol;
    }
    void bfs(TreeNode root, int height) {
        if(root == null) {return;}
        if(lol.size() <= height) {
            lol.add(new LinkedList<Integer>());
        }
        if(height % 2 == 0) {
            lol.get(height).add(root.val);
        }
        else {
            lol.get(height).add(0, root.val);
        }
        if(root.left != null) {bfs(root.left, height+1);}
        if(root.right != null) {bfs(root.right, height+1);}
    }
}