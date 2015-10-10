public class Solution {
    public String countAndSay(int n) {
        String cur, result = "1";
        while(--n > 0) {
            cur = result;
            result = "";
            int len = cur.length(), num = 1;
            for(int i = 1; i <= len; i++) {
                // here I used if(), it ran in wrong
                while(i < len && cur.charAt(i) == cur.charAt(i-1)) { 
                    num++; i++;
                }
                result += Integer.toString(num) + cur.charAt(i-1);
                num = 1;
            }
        }
        return result;
    }
}