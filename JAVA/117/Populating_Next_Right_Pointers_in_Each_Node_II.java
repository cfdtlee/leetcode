/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode tempNode = new TreeLinkNode(0);
        while(root != null) {
            TreeLinkNode curNode = tempNode;
            while(root != null) { //
                if(root.left != null) {
                    curNode.next = root.left;
                    curNode = curNode.next;
                }
                if(root.right != null) {
                    curNode.next = root.right;
                    curNode = curNode.next;
                }
                root = root.next;
            }
            root = tempNode.next;
            tempNode.next = null;
        }
    }
}