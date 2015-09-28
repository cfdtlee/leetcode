public class Solution {
    public int maxArea(int[] height) {
        int max = 0, volume = 0, i = 0, j = height.length-1;
        while(i < j) {
            max = Math.max(max, Math.abs(j - i) * Math.min(height[j], height[i]));
            if(height[i] > height[j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return max;
    }
}