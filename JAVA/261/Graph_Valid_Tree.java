public class Solution {
    public boolean validTree(int n, int[][] edges) {
        int[] sets = new int[n];
        Arrays.fill(sets, -1);
        for(int i = 0; i < edges.length; i++) {
            int x = find(sets, edges[i][0]), y = find(sets, edges[i][1]);
            if(x == y) {
                return false;
            }
            else {
                sets[x] = y; //
            }
        }
        return n == edges.length + 1; // not always rigth
    }
    int find(int[] sets, int target) {
        while(sets[target] != -1) { // use while not if
            target = sets[target];
        }
        return target;
    }
}