// space = O(1)
public class Unique_Paths4 {
    public static int uniquePaths(int m, int n) {
        if(m > n) {
            return uniquePaths(n, m);
        }
        m--; n--;
        // int result = 1; //should be long
        long result = 1;
        int j = 0;
        for(int i = 1; i <= n; i++) {
        	result *= m+i;
            result /= i;
        }
        return (int)result;
    }
    public static void main(String[] args) {
    	System.out.println(uniquePaths(3, 3));
    }
}