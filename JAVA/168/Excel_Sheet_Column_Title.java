public class Solution {
    public String convertToTitle(int n) {
        int rest;
        String res = "";
        while(n > 0) {
            rest = ((n-1) % 26) + 1; // what if the rest == 0?? should be z, but it will be @
            char c = (char)('A' + rest - 1); 
            res = c + res;
            n = (n-1) / 26; // n /= 26 will run into bug, cause 26 / 26 = 1
        }
        return res;
    }
}

public class Solution {
    public String convertToTitle(int n) {
        // is this right ?????? yes because --n come into effect immediately 
        return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
    }
}

public class Solution {
    public String convertToTitle(int n) {
        int rest;
        String res = "";
        while(n > 0) {
            rest = --n % 26; // what if the rest == 0?? should be z, but it will be @
            char c = (char)('A' + rest); 
            res = c + res;
            n /= 26; // n /= 26 will run into bug, cause 26 / 26 = 1
        }
        return res;
    }
}