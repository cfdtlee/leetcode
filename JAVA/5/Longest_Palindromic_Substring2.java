public class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int max = 0, begin = 0, end = 0, head = 0, rail = 0;
        String res = "";
        for(int i = 0; i < s.length(); ) {
            begin = i;
            end = i;
            if(s.length() - i < max/2) break;
            while(end < s.length() - 1 && s.charAt(end) == s.charAt(end + 1)) {
                // when use inde+1, must judge index < len-1
                 end++; //
            } 
            i = end+1; //!!!!!!!!
            while(begin > 0 && end < s.length()-1 && s.charAt(begin-1) == s.charAt(end+1)) {
                begin--; end++;
            }
            if(max < end + 1 - begin) {
                max = end + 1 - begin;
                //res = s.substring(begin, end+1); store ptr is faster!
                head = begin;
                rail = end+1;
            }
        }
        return s.substring(head, rail);
    }
}