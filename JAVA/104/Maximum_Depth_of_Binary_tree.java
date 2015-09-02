
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Maximum_Depth_of_Binary_tree {
    public static int maxDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        else {
        	int left = maxDepth(root.left);
        	int right = maxDepth(root.right);
        	int result = left > right ? left : right;
        	return result + 1;
        }
    }
}