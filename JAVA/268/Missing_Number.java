// try to use bitmanipulation
public class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length*(nums.length+1)/2;
        for(int i = 0; i < nums.length; i++) {
            result -= nums[i];
        }
        return result;
    }
}