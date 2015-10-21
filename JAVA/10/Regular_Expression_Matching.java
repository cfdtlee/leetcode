public class Solution {
    public boolean isMatch(String s, String p) {
        // System.out.println(s + ' ' + p);
        int sLen = s.length(), pLen = p.length();
        if(pLen == 0) return sLen == 0; // pLen = a*? ;
        if(sLen == 0) return pLen == 0 || pLen > 1 && p.charAt(1) == '*' && isMatch(s, p.substring(2));
        if(pLen > 1 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || ((sLen > 0 && (s.charAt(0) == p.charAt(0)) || p.charAt(0) == '.') && isMatch(s.substring(1), p))); // when try to get s.charAt(0) make sure s is not empty
        }
        else {
            return (sLen > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1), p.substring(1)));
        }
    }
}