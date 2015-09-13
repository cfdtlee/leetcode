public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, production = 1;
        int[] result = new int[n];
        result[0] = 1;
        production = 1;
        for(int i = 1; i < n; i++) {
            result[i] = production * nums[i-1];
            production = result[i];
        }
        production = nums[n-1];
        for(int i = n-2; i >=0; i--) {
            result[i] *= production;
            production *= nums[i];
        }
        return result;
    }
}