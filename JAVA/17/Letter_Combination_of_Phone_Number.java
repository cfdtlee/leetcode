public class Solution {
    String[] ch = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> los = new LinkedList<String>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return los;
        dfs(digits, "");
        return los;
    }
    void dfs(String digits, String str) {
        if(digits.length() == 0) {
            los.add(str);
        }
        else {
            int index = digits.charAt(0) - '2';
            for(int i = 0; i < ch[index].length(); i++) {
                dfs(digits.substring(1), str + ch[index].charAt(i));
            }
        }
    }
}