public class Solution {
    List<String> result= new ArrayList<String>();
    String str = new String();
    public List<String> generateParenthesis(int n) {
        if(n < 1) {return null;}
        str += '(';
        dfs(n, 1, 0, str);
        return result;
    }
    void dfs(int n, int leftNum, int rightNum, String str) {
        if(2 * n == str.length()) {
            result.add(str);
        }
        else {
            if(leftNum < n) {
                dfs(n, leftNum+1, rightNum, str + '(');
            }
            if(rightNum < n && rightNum < leftNum) {
                dfs(n, leftNum, rightNum+1, str + ')');
            }
        }
    }
}