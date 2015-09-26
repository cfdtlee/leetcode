import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solveNQueens(7));
    }
}

class Solution {
    public List<List<String>> result = new ArrayList<List<String>>();
    public int[] t; // t[k] = j means ith row put jth colum
    public int resultNum = 0;
    public List<List<String>> solveNQueens(int n) {
        t = new int[n];
        backtrack(0);
        return result;
    }
    Boolean placeable(int k) { // t[k]
        if(k == 0) return true;
        for(int i = 0; i < k; i++) {
            if(t[i] + i == t[k] + k || t[i] - i == t[k] - k || t[k] == t[i]) {
                return false;
            }
        }
        return true;
    }
    void backtrack(int k) {
        if(k == t.length) { // !!
            addToResult();
            return;
        }
        for(int j = 0; j < t.length; j++) { //t[1] = ?
            t[k] = j;
            if(placeable(k)) {
                backtrack(k+1);
            }
        }
        return;
    }
    void addToResult() {
        resultNum++;
        List<String> ls = new ArrayList<String>();
        String str = new String();
        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t.length; j++) {
                if(j == t[i]) {
                    str += 'Q';
                }
                else {
                    str += '.';
                }
            }
            ls.add(str);
            str = "";
        }
        result.add(ls);
    }
}