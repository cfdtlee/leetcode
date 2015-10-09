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
        // 第一次'0'的单引号漏掉了，找了很久才发现！！！
        if(i < 0 || i == grid.length || j <0 || j == grid[i].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        for(int k = 0; k < x.length; k++) {
            // if(i+x[k] < grid.length && i+x[k]>=0 && j+y[k] < grid[0].length && j+y[k] >=0 && grid[i+x[k]][j+y[k]] == '1')
            dfs(grid, i+x[k], j+y[k]);
        }
    }
}