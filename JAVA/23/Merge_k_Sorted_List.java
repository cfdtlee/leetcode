/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode res = null, track = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {return a.val - b.val;}
        });
        for(ListNode list : lists) { // for loop initialization
            if(list == null) {continue;}
            pq.add(list);
        }
        
        if(!pq.isEmpty()) {
            res = pq.poll();
            if(res.next != null)
                pq.add(res.next); // java.lang.NullPointerException
            res.next = null;
            track = res;
        }
        while(!pq.isEmpty()) {
            ListNode tempNode = pq.poll();
            if(tempNode == null) {continue;}
            track.next = tempNode;
            track = track.next;
            if(track.next != null)
                pq.add(track.next);
            track.next = null;
        }
        return res;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {return a.val - b.val;}
        });
        for(ListNode list : lists) { // for loop initialization
            if(list == null) {continue;}
            pq.add(list);
        }
        ListNode res = new ListNode(0);
        ListNode track = res;
        while(!pq.isEmpty()) {
            track.next = pq.poll();
            track = track.next;
            if(track.next != null)
                pq.add(track.next);
        }
        return res.next;
    }
}