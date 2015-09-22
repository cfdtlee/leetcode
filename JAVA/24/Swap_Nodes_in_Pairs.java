/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) {return head;}
        // ListNode fake = new ListNode(0);
        // fake.next = head;
        ListNode cur = head.next;
        // ListNode result = head.next;
        head.next = swapPairs(cur.next);
        cur.next = head;
        return cur;
    }
}