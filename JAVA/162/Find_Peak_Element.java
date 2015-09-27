public class Solution {
    public int findPeakElement(int[] nums) {
        int begin = 0, end = nums.length-1, mid = (begin + end)/2;
        while(begin < end) {
            
            if(nums[mid] > nums[mid + 1]) {
                end = mid; // attention, you cannot skip mid when moving to left part, cause you may miss the peek
            }
            else {
                begin = mid+1;
                
            }
            mid = (begin + end)/2;
            System.out.print(mid);
        }
        return begin;
    }
}