public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int i = 0, j = nums.length - 1, temp;
        while(i <= j) {
            if(nums[i] == val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = nums[i];
                // nums[i] ^= nums[j];
                // nums[j] ^= nums[i];
                j--;
            }
            else { // check the number which was move into forward
                i++;
            }
        }
        return j+1;//Arrays.copyOfRange(nums, 0, i);
    }
} // 

