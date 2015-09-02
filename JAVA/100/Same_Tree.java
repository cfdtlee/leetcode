// recurision method

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else if(p == null && q != null || p != null && q == null) {
            return false;
        }
        else return isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val == q.val;
    }
}