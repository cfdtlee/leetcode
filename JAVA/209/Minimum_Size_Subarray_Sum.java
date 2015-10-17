public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0, j = 0, res = nums.length+1, sum = 0;
        while(i <= j && j < nums.length) {
            sum += nums[j++];
            while(sum >= s) { // minus must be operate many times until sum < s, otherwise the last one added will not be consider
                res = (j-i) > res ? res : (j-i); // must change index in every iterate
                sum -= nums[i++];
            }
        }
        System.out.print(i);System.out.println(j);
        return res == nums.length+1 ? 0 : res; // it is mentioned in the question "If there isn't one, return 0 instead"
    }
}


public class Solution {  // Why time limit!!??
    public int minSubArrayLen(int s, int[] nums) {
        int[] sums = new int[nums.length+1]; int res = nums.length+1;
        for(int i = 1; i < sums.length; i++) { // use sums.length not nums.length
            sums[i] = sums[i-1] + nums[i-1];
        }
        for(int i = 0; i < sums.length; i++) {
            int begin = i+1, end = sums.length-1, mid;
            int target = sums[i] + s;
            while(begin <= end) {
                mid = begin + (end - begin) / 2;
                if(sums[mid] >= target) {
                    end = mid - 1;
                }
                else {
                    begin = mid + 1;
                }
            }
            if(begin == sums.length) break;
            // System.out.println(begin - i);
            res = (begin - i) > res ? res : (begin - i);
            
        }
        return res == nums.length+1 ? 0 : res;
    }
}
