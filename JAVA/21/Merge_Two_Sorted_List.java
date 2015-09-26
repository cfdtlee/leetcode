/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ln3;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val > l2.val) {
            ln3 = l1;
            l1 = l2;
            l2 = ln3;
        }
        ListNode ln1 = l1, ln2 = l2;
        while(ln1.next != null) {
            if(ln1.next.val > ln2.val) {
                ln3 = ln1.next;
                ln1.next = ln2;
                ln2 = ln3;
                ln1 = ln1.next;
            }
            else {
                ln1 = ln1.next;
            }
        }
        if(ln1.next == null) {
            ln1.next = ln2;
        }
        return l1;
    }
}