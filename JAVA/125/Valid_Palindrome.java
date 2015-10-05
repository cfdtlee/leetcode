public class Solution {
    public boolean isPalindrome(String s) {
        // s = s.replaceAll("\W", "");
        s=s.replaceAll("\\W", "");
        System.out.println(s);
        s = s.toLowerCase();
        int i = 0, j = s.length()-1;
        
        while(i <= j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++; j--;
            }
            else break;
        }
        return i>j;
    }
}