/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pt = head;
        if (pt == null) return head;
        while(pt != null && pt.next != null) // miss to judge pt != null
        {
            if(pt.val == pt.next.val) {
                pt.next = pt.next.next;
            }
            else { // miss this else
                pt = pt.next;
            }
        }
        return head;
    }
}