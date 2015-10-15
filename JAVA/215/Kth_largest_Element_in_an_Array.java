public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k+1);
        for(int n : nums) {
            pq.add(n);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}