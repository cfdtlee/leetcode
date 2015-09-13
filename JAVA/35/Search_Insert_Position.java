// while(begin <= end) is the crucialest centence,
// other if...else are useless
// at the end, end + 1 == begin

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int begin = 0, end = nums.length - 1, mid = 0;
        // if(nums.length == 1) {
        //     if(target > nums[0]) {
        //         return 1;
        //     }
        //     else {
        //         return 0;
        //     }
        // }
        // if(target > nums[end]) {
        //     return end+1;
        // }
        // if(target < nums[begin]) {
        //     return begin;
        // }
        while(begin <= end) {
            mid = (begin + end) / 2;
            if(target == nums[mid]) {
                return mid;
            }
            // if(target < nums[end] && target > nums[begin] && end == begin + 1) {
            //     return end;
            // }
            // else
            if (target > nums[mid]) {
                begin = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return end+1; // or return begin;
    }
}
