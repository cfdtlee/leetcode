/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// Wrong answer
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = head, cur = head;
        if(head == null) return null;
        while(cur.next != null) {
            if(cur.val == val) { //remove cur !!但是这种方法移除不了尾节点！！
                cur.val = cur.next.val;
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        // if(cur.next == null) {
        //     cur = null;
        // }  为什么这种方法删除不了末尾的节点？？？？
        return head.val == val? head.next : head;
    }
}

//链表题循环的时候注意前进（i++），注意保持首结点

// AC solution
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = head, cur = head;
        if(head == null) return null;
        while(cur.next != null) {
            if(cur.next.val == val) { //remove cur.next
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        return head.val == val? head.next : head;
    }
}