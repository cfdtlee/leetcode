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
        if(root == null) {
            return listOfList;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> list = new LinkedList<Integer>();
            int num = queue.size();
            for(int i = 0; i < num; i++) {
                if(queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                list.add(queue.poll().val);
            }
            listOfList.add(list);
        }
        return listOfList;
    }
}