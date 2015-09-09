// space = O(max(m, n))
public class Unique_Paths3 {
    public static int uniquePaths(int m, int n) {
        if(m > n) {
            return uniquePaths(n, m);
        }
        int cur[] = new int[n+1];
        // int pre[] = new int[n+1];
        for(int i = 0; i < n; i++) {
        	cur[i] = 1;
            // pre[i] = 1;
        }
        for(int i = 1; i < m; i++) {
        	for(int j = 1; j < n; j++) {
        		cur[j] = cur[j-1] + cur[j];
                // pre[j] = cur[j];
        	}
        }
        return cur[n-1];
    }
    public static void main(String[] args) {
    	System.out.println(uniquePaths(3, 3));
    }
}