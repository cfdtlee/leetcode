public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return nums[0];
        }
        int[] f = new int[n];
        f[0] = nums[0];
        f[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for(int i = 2; i < n; i++) {
            f[i] = Math.max(f[i-2] + nums[n], f[n-1]);
        }
        return f[n-1];
    }
}

public class Solution2 { // narrow space to O(1)
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return nums[0];
        }
        // int[] f = new int[n];
        int a = nums[0];
        int b = nums[0] > nums[1] ? nums[0] : nums[1];
        int c = b;
        for(int i = 2; i < n; i++) {
            c = Math.max(a + nums[i], b);
            a = b;
            b = c;
        }
        return c;
    }
}