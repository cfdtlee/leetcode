/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        // if(head.next == null) return head;
        // ListNode mid = getMid(head, null);
        return mergeSort(head, null);
    }
    ListNode mergeSort(ListNode head, ListNode end) {
        if(head == end) return head;
        ListNode mid = getMid(head, end), t = mid.next;
        mid.next = null;
        head = mergeSort(head, mid);
        mid = mergeSort(t, end);
        return merge(head, t);
    }
    ListNode merge(ListNode head, ListNode mid) {
        ListNode t1 = head, t2;
        if(head == null) return mid;
        if(mid == null) return head;
        if(head.val > mid.val) { // let head be the smallest node
            t1 = head;
            head = mid;
            mid = t1;
        }
        t1 = head;
        while(t1.next != null) { // merge sorted list
            if(t1.next.val > mid.val) {
                t2 = t1.next;
                t1.next = mid;
                mid = t2;
            }
            t1 = t1.next;
        }
        if(t1.next == null) {
            t1.next = mid;
        }
        return head;
    }
    ListNode getMid(ListNode head, ListNode end) {
        ListNode mid = head, pre = head;
        while(pre != end) {
            pre = pre.next;
            if(pre == end) break;
            pre = pre.next;
            // if(pre == end) break;
            mid = mid.next;
        }
        System.out.println(mid.val);
        return mid;
    }
}