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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lol = new LinkedList<List<Integer>>();
        if(root == null) return lol;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode node;
        while(!queue.isEmpty()) {
            List<Integer> list = new LinkedList<Integer>();
            int count = queue.size();
            while(count-- > 0) {
                System.out.println(count);
                list.add(queue.peek().val);
                node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            lol.add(0, list);
        }
        // Collections.reverse(lol);
        return lol;
    }
}

if use BFS, list can be added like this
list.get(list.size()-level-1).add(root.val);