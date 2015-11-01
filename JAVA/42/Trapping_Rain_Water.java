public class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length], right = new int[height.length];
        int res = 0, i = 0, j = height.length-1;
        int leftMax = 0, rightMax = 0;
        while(i < j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            if(leftMax > rightMax) {
                res += (rightMax - height[j--]);
            }
            else {
                res += (leftMax - height[i++]);
            }
        }
        return res;
    }
}