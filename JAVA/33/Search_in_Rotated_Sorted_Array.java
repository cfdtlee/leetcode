public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int start = 0, end = nums.length-1, mid;
        while(start < end) { // get the real mid
            mid = start + (end - start) / 2;
            if(mid >= 1 && nums[mid] < nums[mid-1]) {
                start = mid;
                break;
            }
            if(nums[mid] < nums[end]) end = mid - 1;
            else start = mid + 1;
        }
        // System.out.println(start);
        int minPos = start, realMid; start = 0; end = nums.length - 1;
        while(start <= end) { // <=
            mid = start + (end - start) / 2;
            // System.out.println(mid);
            realMid = (mid + minPos) % nums.length; //
            if(nums[realMid] == target) return realMid;
            if(nums[realMid] < target) start = mid + 1;
            else end = mid - 1; // use mid
        }
        return -1;
    }
}