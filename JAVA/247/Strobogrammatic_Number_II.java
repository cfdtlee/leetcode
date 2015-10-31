public class Solution {
    List<String> list = new LinkedList<String>();
    List<String> sign = new ArrayList<String>();
    public List<String> findStrobogrammatic(int n) {
        sign.add("00"); sign.add("11"); sign.add("88"); sign.add("69"); sign.add("96");
        dfs(n, "");
        return list;
    }
    void dfs(int n, String str) {
        if(n <= 0) list.add(str);
        else {
            int h = str.length()/2;
            int len = sign.size(), begin;
            if(str.length() == 0) begin = 1;
            else begin = 0;
            if(n != 1) {
                for(int i = begin; i < len; i++) {
                    dfs(n-2, str.substring(0, h) + sign.get(i) + str.substring(h));
                }
            }
            else {
                for(int i = 0; i < len-2; i++) {
                    dfs(n-2, str.substring(0, h) + sign.get(i).charAt(0) + str.substring(h));
                }
            }
            
        }
    }
}