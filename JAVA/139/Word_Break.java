public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        Boolean[] b = new Boolean[s.length()+1];
        Arrays.fill(b, false);
        b[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                if(b[j] && wordDict.contains(s.substring(j, i))) {
                    b[i] = true;
                    break;
                }
            }
        }
        return b[s.length()];
    }
}
