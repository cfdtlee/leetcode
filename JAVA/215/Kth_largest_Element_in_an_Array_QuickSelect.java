public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return select(nums, 0, nums.length-1, k-1); // k?
    }
    int select(int[] nums, int left, int right, int k) {
        if(left == right) return nums[left]; // don't miss the boundary condition
        int pivotIndex = partition(nums, left, right);
        if(pivotIndex == k) return nums[k];
        if(pivotIndex > k) return select(nums, left, pivotIndex-1, k);
        return select(nums, pivotIndex+1, right, k);
    }
    int partition(int[] nums, int left, int right) {
        int pivotIndex = right;//= left + new Random().nextInt(right - left + 1);
        for(int i = left; i < right-1; i++) { //i < right-1
            if(nums[i] > nums[pivotIndex]) {
                swap(nums, i, left);
                left++;
            }
        }
        swap(nums, left, pivotIndex);
        return left;
    }
    void swap(int[] nums, int a, int b) {
        
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}