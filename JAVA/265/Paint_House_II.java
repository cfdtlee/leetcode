public class Solution {
    public int minCostII(int[][] costs) {
        if(costs.length == 0) return 0;
        int n = costs.length, k = costs[0].length;
        int min1 = -1, min2 = -1;
        for(int i = 0; i < n; i++) {
            int last1 = min1, last2 = min2;
            min1 = -1; min2 = -1;
            for(int j = 0; j < k; j++) {
                //current color is the same as last
                System.out.print(last1);System.out.println(last2);
                if(j == last1) {
                    System.out.println(last2);
                    costs[i][j] += last2 < 0 ? 0 : costs[i-1][last2];  // use former result"i-1"
                }
                else {
                    
                    costs[i][j] += last1 < 0 ? 0 : costs[i-1][last1];
                }
                //find the min
                if(min1 < 0 || costs[i][j] < costs[i][min1]) {
                    min2 = min1;
                    min1 = j;
                }
                else if(min2 < 0 || costs[i][j] < costs[i][min2]) { //use else here to get the second min
                    min2 = j;
                }
            }
        }
        return costs[n-1][min1];
    }
}