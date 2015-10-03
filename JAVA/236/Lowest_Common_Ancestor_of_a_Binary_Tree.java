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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> listOfP = new ArrayList<TreeNode>();
        List<TreeNode> listOfQ = new ArrayList<TreeNode>();
        findNode(p, listOfP, root);
        findNode(q, listOfQ, root);
        int i = 0;
        for(i = 0; i < listOfP.size() && i < listOfQ.size(); i++) {
            if(listOfP.get(i) != listOfQ.get(i)) {
                break;
            }
        }
        return listOfP.get(i-1);
        // System.out.println(listOfP.size());
    }
    Boolean findNode(TreeNode n, List<TreeNode> list, TreeNode root) {
        if(root == null) {return false;}
        list.add(root);
        if(n == root) {return true;}
        if(findNode(n, list, root.left)) {
            return true;
        }
        else if(findNode(n, list, root.right)) {
            
            return true;
        }
        else {
            list.remove(list.size()-1);
            return false;
        }
    }
}