public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length-1; i+=2) {
            swap(nums, i, i+1);
        }
    }
    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

public class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i < nums.length; i+=2) {
            if(nums[i] < nums[i-1])
                swap(nums, i, i-1);
            if(i+1 < nums.length && nums[i] < nums[i+1])
                swap(nums, i, i+1);
        }
    }
    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}