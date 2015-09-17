public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int[] s = new int[prices.length];
        int[] m = new int[prices.length];
        s[0] = 0;
        m[0] = prices[0];
        for(int i = 1; i < prices.length; i++) {
            m[i] = min(m[i-1], prices[i]);
            s[i] = max(prices[i] - m[i-1], s[i-1]);
        }
        return s[prices.length-1];
    }
    int min(int a, int b) {
        return a < b ? a : b;
    }
    int max(int a, int b) {
        return a > b ? a : b;
    }
}