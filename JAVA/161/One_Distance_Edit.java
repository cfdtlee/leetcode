public class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return false;
        int i = 0, j = 0;
        if(s.length() > t.length()) return isOneEditDistance(t, s); // keep s shorter
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) != t.charAt(j)) {
                return s.substring(i).equals(t.substring(j+1)) || s.substring(i+1).equals(t.substring(j+1));
            }
            i++; j++;
        }
        return j == t.length()-1;
    }
}