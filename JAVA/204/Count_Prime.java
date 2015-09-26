public class Solution {
    public int countPrimes(int n) {
        if(n == 0) return 0;
        Boolean[] isPrime = new Boolean[n+1];
        int result = 0;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i < n; i++) {
            if(isPrime[i]) {
                result++;
                for(int j = i*2; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return result;
    }
}