//

public class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new Map<Integer, Integer>();
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}