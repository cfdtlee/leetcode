public class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        if(len < 1) return 0;
        int begin = 0, end = len-1, mid = citations[0] > 0 ? 1 : len;
        while(begin <= end) {  // equeal here must with end = mid-1 and begin = mid + 1
            mid = (begin + end)/2;
            if(len - mid == citations[mid]) {
                return len - mid;
            }
            if(len - mid < citations[mid]) {
                end = mid - 1;
            }
            else {
                begin = mid + 1;
            }
        }
        return len-begin;
    }
}