// Try to use recursive to implrment it.
 
public class Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, next;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        reverseList(l1);
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}