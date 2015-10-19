public class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        String t = new StringBuffer(s).reverse().toString();
        int[][] len = new int[s.length()+1][t.length()+1];
        int begin = 0, end = 0, max = 0;
        for(int i = 1; i < s.length()+1; i++) {
            for(int j = 1; j < t.length()+1; j++) {
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    len[i][j] = 1 + len[i-1][j-1];
                    // System.out.print(i);System.out.println(j);
                }
                else {
                    len[i][j] = 0; //Math.max(len[i-1][j], len[i][j-1]);
                }
            }
        }
        for(int i = 0; i < s.length()+1; i++) {
            for(int j = 0; j < t.length()+1; j++) {
                if(len[i][j] > max) {
                    end = i;
                    max = len[i][j];
                }
            }
            
        }
        // System.out.println("nothing?");
        
        return s.substring(end - max, end);//"";// begin > end ? s.substring(s.length()-begin, end) : s.substring(s.length()-end, begin);
    }
}