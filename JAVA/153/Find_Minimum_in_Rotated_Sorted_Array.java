public class Solution {
    public int findMin(int[] nums) {
        int begin = 0, end = nums.length - 1;
        while(begin < end) {
            if(nums.length == 0) {return 0;}
            // if(nums.length == 1)
            int mid = (begin + end)/2;
            if(mid >= 1 && nums[mid] < nums[mid-1]) {
                return nums[mid];
            }
            else {
                if (nums[mid] >= nums[begin] && nums[mid] > nums[end]) {
                    begin = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return nums[begin];
    }
}