public class Climbing_Stairs {
    public static int climbStairs(int n) {
        int a = 0, ways = 0;
        for(int b = 0; b <= n/2; b++) {
            a = n - 2*b;
            int under = 1, above = 1;
            for(int i = 1; i <= a; i++) {
                under *= i;
                System.out.println(under);
            }
            for(int i = b+1; i <= a+b; i++) {
                above *= i;
            }
            ways += above/under;
        }
        return ways;
    }
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        System.out.println(climbStairs(n));
    }
}