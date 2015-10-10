public class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] count = new int[256];
        int odd = 0;
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] % 2 == 1) odd++;
        }
        return s.length() % 2 >= odd;
    }
}