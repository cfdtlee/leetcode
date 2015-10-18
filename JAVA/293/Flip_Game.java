public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new LinkedList<String>();
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == '-' || s.charAt(i+1) == '-') continue;
            list.add(s.substring(0, i) + "--" + s.substring(i+2, s.length()));
        }
        return list;
    }
}