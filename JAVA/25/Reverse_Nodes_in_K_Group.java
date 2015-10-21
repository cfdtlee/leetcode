/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
*/
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head;
        if(head == null) return head;
        int n = 1;
        while(ptr.next != null) {
            ptr = ptr.next;
            n++;
        }
        return reverse(head, k, n);
    }
    ListNode reverse(ListNode head, int k, int n) {
        if(n < k) return head;
        ListNode pre = null, cur = head, next;
        for(int i = 0; i < k; i++) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = reverse(cur, k, n-k);
        return pre;
    }
}