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
    List<String> result = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) {return result;}
        String path = new String();
        getPath(root, path);
        return result;
    }
    void getPath(TreeNode root, String path) {
        if(root.left == null && root.right == null) {result.add(path + Integer.toString(root.val));}
        if(root.left != null) {
            getPath(root.left, path + Integer.toString(root.val) + "->");
        }
        if(root.right != null) {
            getPath(root.right, path + Integer.toString(root.val) + "->");
        }
    }
}