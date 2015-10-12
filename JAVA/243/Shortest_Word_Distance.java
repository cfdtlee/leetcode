public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int first = -1, second = -1, res;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equals(word1)) {
                first = i;
            }
            if(words[i].equals(word2)) {
                second = i;
            }
            if(first != -1 && second != -1) {
                res = Math.min(Math.abs(second - first), res);
            }
        }
        return res;
    }
}