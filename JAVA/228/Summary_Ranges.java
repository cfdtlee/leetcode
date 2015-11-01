public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i = 0, j = 1;
        List<String> list = new LinkedList<String>();
        for(i = 0; i < nums.length; ) { // i not ++
            while(j < nums.length && j > 0 && nums[j] == nums[j-1]+1) {
                j++;
            }
            // 
            String str = nums[i] == nums[j-1] ? Integer.toString(nums[i]) : Integer.toString(nums[i]) + "->" + Integer.toString(nums[j-1]);
            list.add(str);
            i = j++;
        }
        return list;
    }
}