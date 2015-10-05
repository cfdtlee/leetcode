public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {return 0;}
        int end = nums.length - 1, t, i = 0, j = 0;
        while(j < nums.length && i < nums.length) {
            if(nums[j] > nums[i]) {
                i++;
                t = nums[i];
                nums[i] = nums[j];
                nums[j++] = t;
            }
            else {j++;}
        }
        return i+1;
    }
}

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {return 0;}
        int i = 1, j = 1;
        for(i = 1; i < nums.length; i++) {
            if(nums[i] > nums[j-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}