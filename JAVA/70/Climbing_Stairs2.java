public class Climbing_Stairs2 {
    public static int climbStairs(int n) {
        int a = 0, ways = 0;
        int[][] tb = new int[n+1][n/2+1];
        tb[0][0] = 0;
        for(int i = 1; i < n+1; i++) {
            tb[i][0] = 1;
        }
        for(int i = 1; i < n/2+1; i++) {
            tb[0][i] = 1;
        }
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < n/2+1; j++ ) {
                tb[i][j] = tb[i-1][j] + tb[i][j-1];
            }
        }
        for(int b = 0; b <= n/2; b++) {
            a = n - 2*b;
            // System.out.println(tb[a][b]);
            ways += tb[a][b]; //
            // int under = 1, above = 1;
            // for(int i = 1; i <= a; i++) {
            //     under *= i;
            //     System.out.println(under);
            // }
            // for(int i = b+1; i <= a+b; i++) {
            //     above *= i;
            // }
            // ways += above/under;
        }
        return ways;
    }
    // int count(int a, int b) {
    //     int[][] tb = new int[][]
    // }
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        System.out.println(climbStairs(n));
    }
}