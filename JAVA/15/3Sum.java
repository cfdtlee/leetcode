public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lol = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        for(int k = 0; k < nums.length-2; k++) {
            int i = k + 1, j = nums.length-1; //bound!
            if(k == 0 || (nums[k] != nums[k-1])) { //k has to skip the duplicate nums
                while(i < j && j <= nums.length-1) { //don't miss '='
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        while(i < j && nums[i] == nums[i+1]) {i++;} //to skip the duplicate nums
                        while(i < j && nums[j] == nums[j-1]) {j--;} //to skip the duplicate nums
                        lol.add(Arrays.asList(nums[k], nums[i++], nums[j--]));
                    }
                    else if(nums[i] + nums[j] + nums[k] > 0) {j--;}
                    else {i++;}
                }
            }
        }
        return lol;
    }
}

