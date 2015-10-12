public class Solution {
    public int lengthOfLastWord(String s) {
        for(int i = s.length(); i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                return s.length() - i - 1;
            }
        }
    }
}