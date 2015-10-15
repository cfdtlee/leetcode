public class Solution {
    public int findKthLargest(int[] nums, int k) {
        k--;
        int begin = 0, end = nums.length - 1;
        while(begin < end) {
            int pivotIndex = partition(nums, begin, end); // begin and end not 0 and nums.length - 1
            if(pivotIndex < k) begin = mid + 1;
            else if(pivotIndex > k) end = mid - 1;
            else break;
        }
        return nums[k];
    }
    int partition(int[] nums, int left, int right) {
        int pivotIndex = right;//= left + new Random().nextInt(right - left + 1);
        for(int i = left; i < right; i++) { //int i = left!! i < right
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