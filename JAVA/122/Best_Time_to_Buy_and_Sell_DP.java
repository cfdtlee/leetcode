public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int[] s = new int[prices.length];
        s[0] = 0;
        for(int i = 1; i < prices.length; i++) {
            s[i] = max(s[i-1], s[i-1] - prices[i-1] + prices[i]);
        }
        return s[prices.length-1];
    }
    int max(int a, int b) {
        return a > b ? a : b;
    }
}