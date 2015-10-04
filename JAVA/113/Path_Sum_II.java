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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root != null) {
            dfs(root, sum, new LinkedList<Integer>());
        }
        return lol;
    }
    void dfs(TreeNode root, int sum, List<Integer> list) {
        if(root.left == null && root.right == null) {
            list.add(root.val);
            if(sum == root.val) {lol.add(new LinkedList<Integer>(list));}
            else {return;}
        }
        else {
            list.add(root.val);
            if(root.left != null) {
                dfs(root.left, sum - root.val, list);
                list.remove(list.size()-1);
            }
            if(root.right != null) {
                dfs(root.right, sum - root.val, list);
                list.remove(list.size()-1);
            }
        }
    }
}