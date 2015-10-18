public class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return "";
        int[] remain = new int[128];
        int require = t.length();
        for(int i = 0; i < t.length(); i++) {
            remain[(int)t.charAt(i)]++;
        }
        int start = 0, end = 0, min = Integer.MAX_VALUE, minStart = 0;
        while(end <= s.length() && start < s.length()) { // end <= s.length()
            if(require > 0) { // end move forward, require > 0
                if(end == s.length()) break; // in case that t is longer than s
                remain[s.charAt(end)]--;
                if(remain[s.charAt(end)] >= 0) require--;
                end++;
            }
            else { // start move forward
                if(min > end - start) {
                    min = end - start;
                    minStart = start;
                }
                remain[s.charAt(start)]++;
                if(remain[s.charAt(start)] > 0) require++;
                start++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart+min); //take care that t might be longer than s
    }
}