public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, temp; // i is the index of nonzero, j is finally index of nonzero
        while(i < n) {
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}