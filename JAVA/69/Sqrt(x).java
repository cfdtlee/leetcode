public class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int begin = 1, end = x, mid = (x+1)/2;
        while(begin <= end) {
            if(mid <= x/mid) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
            mid = (begin + end) / 2;
            
        }
        return mid;
    }
}