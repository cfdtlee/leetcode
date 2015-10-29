public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;
        int i = 0, j = nums.length-1;
        for(i = nums.length - 2; i >= 0; i--) {
            if(nums[i+1] > nums[i]) {break;}
        }
        if(i == -1) {
            i++; //
            while(i < j) {
                swap(nums, i++, j--);
            }
        }
        else {
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
            j = nums.length-1; //
            i++;
            while(i < j) {
                swap(nums, i++, j--);
            }
        }
    }
    void swap(int[] nums, int i, int j) {
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}