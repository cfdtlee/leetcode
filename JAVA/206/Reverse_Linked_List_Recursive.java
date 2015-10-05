/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode next = head.next;
        head.next = null;
        return reverseList(next, head);
    }
    public ListNode reverseList(ListNode head, ListNode tail) {
        if(head == null) {
            return tail;
        }
        else {
            ListNode next = head.next;
            head.next = tail;
            return reverseList(next, head);
        }
    }
}