public class Solution {
    public int numDecodings(String s) {
        if(s.length() < 2) {
            if(s.length() == 1 && s.charAt(0) == '0') {
                return 0;
            }
            return s.length();
        }
        int[] nums = new int[s.length()+1];
        nums[0] = 1; 
        nums[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i <= s.length(); i++) {
            if(Integer.parseInt(s.substring(i-2, i)) <= 26 && Integer.parseInt(s.substring(i-2, i)) >= 10) {
                nums[i] += nums[i-2];
            }
            if(Integer.parseInt(s.substring(i-1, i)) != 0) {
                nums[i] += nums[i-1];
            }
        }
        return nums[s.length()];
    }
}