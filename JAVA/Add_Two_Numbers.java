// condition I didn't take into consideration:
// [1, 8], [0]; [5], [5]; [1], [9,9]
public class Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addUp = l1.val + l2.val;
        int val1, val2;
        // int decimal = 0;
        int decimal = addUp/10;
        int rest = addUp%10;
        ListNode ln = new ListNode(rest);
        ListNode ln0 = ln;
        
        // ln.val = l1.val + l2.val;
        while(l1.next != null || l2.next != null || decimal != 0) {
        	if(l1.next != null) {
        		l1 = l1.next;
        		val1 = l1.val;
        	}
        	else {
        		val1 = 0;
        	}
        	if(l2.next != null) {
        		l2 = l2.next;
        		val2 = l2.val;
        	}
        	else {
        		val2 = 0;
        	}
        	addUp = val1 + val2 + decimal;
        	rest = addUp % 10;
        	ln.next = new ListNode(rest);
        	decimal = addUp / 10;
        	ln = ln.next;
        	// ln.val = ln.val = l1.val + l2.val;
        }
        return ln0;
    }
    public static void main(String[] args) {
    	ListNode l1 = new ListNode(1);
    	ListNode l2 = new ListNode(9);
    	l1.next = new ListNode(9);
    	// l2.next = new ListNode(6);
    	ListNode ln0 = addTwoNumbers(l1, l2);
    	System.out.println(ln0.val);
    	while(ln0.next != null) {
    		ln0 = ln0.next;
    		System.out.println(ln0.val);
    	}
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

