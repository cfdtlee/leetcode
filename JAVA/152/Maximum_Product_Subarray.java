public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], max_;
        int min = nums[0], min_, M = nums[0];
        int c = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > 0) {
                max_ = Math.max(max*nums[i], nums[i]);
                min_ = Math.min(min*nums[i], nums[i]);
            }
            else if(nums[i] < 0) {
                max_ = Math.max(min*nums[i], nums[i]);
                min_ = Math.min(max*nums[i], nums[i]);
            }
            else {
                c++;
                max_ = 0;
                min_ = 0;
            }
            max = max_;
            min = min_;
            M = Math.max(M, max);
        }
        return c == nums.length ? 0 : M;
    }
}