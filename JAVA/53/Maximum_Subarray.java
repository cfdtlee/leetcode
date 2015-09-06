public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int s[] = new int[nums.length];
        int max = nums[0];
        s[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	s[i] = nums[i] + (s[i-1] > 0? s[i-1] : 0);
        	max = max > s[i]? max : s[i];
        	//System.out.println(s[i]);
        }
        return max;
    }
    public static void main(String[] args) {
    	int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    	System.out.println(maxSubArray(array));
    }
}