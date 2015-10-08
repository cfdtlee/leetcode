public class Solution {
    int[] x = {0, 0, -1, 1};
    int[] y = {-1, 1, 0, 0};
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    dfs(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }
    void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        if(i < 0 || i == grid.length || j <0 || j == grid[i].length || grid[i][j] != 1) {
            return;
        }
        for(int k = 0; k < x.length; k++) {
            dfs(grid, i+x[k], j+y[k]);
        }
    }
}