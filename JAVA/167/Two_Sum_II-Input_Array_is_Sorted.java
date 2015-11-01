public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            int tar = target - numbers[i];
            int begin = i+1, end = numbers.length-1;//!!!!
            while(begin <= end) {
                int mid = begin + (end - begin)/2;
                if(numbers[mid] == tar) {
                    res[0] = i+1; res[1] = mid+1;
                    return res;
                }
                else if(numbers[mid] > tar) {
                    end = mid - 1;
                }
                else begin = mid + 1;
            }
        }
        return res;
    }
}