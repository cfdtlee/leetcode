public class Solution {
    public int romanToInt(String s) {
        int[] digit = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I':
                    digit[i] = 1; break;
                case 'V':
                    digit[i] = 5; break;
                case 'X':
                    digit[i] = 10; break;
                case 'L':
                    digit[i] = 50; break;
                case 'C':
                    digit[i] = 100; break;
                case 'D':
                    digit[i] = 500; break;
                case 'M':
                    digit[i] = 1000; break;
            }
        }
        int exist = 1;
        int result = digit[s.length()-1];
        for(int i = s.length()-2; i >= 0; i--) {
            if(digit[i + 1] > digit[i]) {
                result -= digit[i];
            }
            else {
                result += digit[i];
            }
        }
        return result;
    }
}