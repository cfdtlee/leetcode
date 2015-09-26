public class Perfect_Squares {
    public static int numSquares(int n) {
        // int min = 0;
        int[][] f = new int[n+1][n+1];
        f[1][1] = 1;
        // f[1][1] = 1;
        for(int i = 1; i < n+1; i++) {
            int min = i;
            int j;
            for(j = 1; j * j <= n; j++) {
                if(j*j <= i) {
                    min = Math.min(min, f[i-j*j][j] + 1);
                    f[i][j] = f[i-j*j][j] + 1;
                }
                else {
                    f[i][j] = f[i][(int)Math.sqrt(i)];
                }
            }
            System.out.println("min=" + Integer.toString(min) + "i" + Integer.toString(i) + "j" + Integer.toString(j-1));
            f[i][j-1] = min;
        }
        // System.out.println(f[4][1]);
        return f[n][(int)Math.sqrt(n)];
    }
    public static void main(String[] args) {
        System.out.println(numSquares(Integer.parseInt(args[0])));
    }
}

// narrow down the space
class Perfect_Squares2 { 
    public int numSquares(int n) {
        int[] f = new int[n+1];
        f[1] = 1;
        for(int i = 1; i < n+1; i++) {
            int min = i;
            int j;
            for(j = 1; j * j <= n; j++) {
                if(j*j <= i) {
                    min = Math.min(min, f[i-j*j] + 1);
                    f[i] = f[i-j*j] + 1;
                }
                else {
                    f[i] = f[i];
                }
            }
            // System.out.println("min=" + Integer.toString(min) + "i" + Integer.toString(i) + "j" + Integer.toString(j-1));
            f[i] = min;
        }
        // System.out.println(f[4][1]);
        return f[n];
    }
}