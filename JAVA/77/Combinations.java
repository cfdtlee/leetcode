public class Solution {
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(new LinkedList(), n, k);
        return lol;
    }
    void dfs(List prod, int n, int k) {
        int i;
        if(prod.size() == k) {
            lol.add(new LinkedList(prod));
        }
        else {
            if(prod.size() == 0) {
                i = 1;
            }
            else {i = (int)prod.get(prod.size()-1)+1;}
            for(; i <= n; i++) {
                prod.add(i);
                dfs(prod, n, k);
                prod.remove(prod.size()-1);
            }
        }
    }
}


// better one!
public class Solution {
    List<List<Integer>> lol = new LinkedList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(new LinkedList(), n, k, 1);
        return lol;
    }
    void dfs(List prod, int n, int k, int start) {
        if(prod.size() == k) {
            lol.add(new LinkedList(prod));
        }
        else {
            for(int i = start; i <= n; i++) {
                prod.add(i);
                dfs(prod, n, k, i+1); // use i+1 as start
                prod.remove(prod.size()-1);
            }
        }
    }
}