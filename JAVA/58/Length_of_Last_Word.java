// for(; i >= 0; i--) {
        //     // attention! s may not contain space
        //     // again! the last char of s may be spaca
        //     if(s.charAt(i) == ' ') {  
        //         break;
        //     }
        // }
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int i = s.length() - 1, res = 0;
        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' ') {
            res++;
            i--;
        }
        return res;
        
        
    }
}