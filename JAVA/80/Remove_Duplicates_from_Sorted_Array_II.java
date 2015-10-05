public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) {return nums.length;}
        int i = 1, j = 2;
        for(i = 1; i < nums.length; i++) {
            if(nums[i] > nums[j-2] && nums[i] >= nums[j]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}