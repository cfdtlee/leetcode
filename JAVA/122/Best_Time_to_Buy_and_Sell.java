//take care of boundary
public class Best_Time_to_Buy_and_Sell {
    public static int maxProfit(int[] prices) {
        for(int i = 0; i < prices.length-1; i++) {
            prices[i] = prices[i+1] - prices[i];
        }
        // int end = 0;
        // for(int i = prices.length-1; i >= 0; i--) {
            // if(prices[i] < 0) {
                // end = i;
                // break;
            // }
        // }
        int max = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            max += prices[i] > 0? prices[i] : 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] test = {1,2};
        System.out.println(maxProfit(test));
    }
}