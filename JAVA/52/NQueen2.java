class Solution {
    public int[] t; // t[k] = j means ith row put jth colum
    public int resultNum = 0;
    public int totalNQueens(int n) {
        t = new int[n];
        backtrack(0);
        return resultNum;
    }
     Boolean placeable(int k) { // t[k]
        if(k == 0) return true;
        for(int i = 0; i < k; i++) {
            if(t[i] + i == t[k] + k || t[i] - i == t[k] - k || t[k] == t[i]) {return false;}
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
    }
}
