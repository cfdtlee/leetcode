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



public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, t;
        while(j < nums.length) {
            if(nums[j] != 0) {
                t = nums[j];
                nums[j++] = nums[i];
                nums[i++] = t;
            }
            else {
                j++;
            }
        }
    }
}