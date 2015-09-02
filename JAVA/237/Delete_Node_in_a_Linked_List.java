//node in function is a temporary variable, so any change of node itself will not take into effect
public class Delete_Node_in_a_Linked_List {
    public static void deleteNode(ListNode node) {
        if(node.next != null) {
        	node.val = node.next.val;
            node.next = node.next.next;
            // System.out.println(node.val);
        }
    }
    public static void main(String[] args) {
    	ListNode ln = new ListNode(1);
    	ListNode ln0 = ln;
    	ln.next = new ListNode(2);
    	ln = ln.next;
    	ln.next = new ListNode(3);
    	ln = ln.next;
    	ln.next = new ListNode(4);
    	deleteNode(ln0);
    	while(ln0.next != null) {
    		System.out.println(ln0.val);
    		ln0 = ln0.next;
    	}
    	// System.out.println(ln0.val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}