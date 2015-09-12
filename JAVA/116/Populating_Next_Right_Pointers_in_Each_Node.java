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
        TreeLinkNode cur, pre = root;
        while(pre != null) {
            cur = pre;
            while(cur != null) {
                if(cur.left != null)
                cur.left.next = cur.right;
                if(cur.next != null && cur.right != null) {
                    cur.right.next = cur.next.left;
                    
                }
                cur = cur.next;
            }
            pre = pre.left;
        }
    }
}