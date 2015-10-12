public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0) return 0;
        int[][] res = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; i++) {
            if(obstacleGrid[i][0] == 1) {break;}
            res[i][0] = 1;
        }
        System.out.printlen(res[0][0]);
        for(int i = 0; i < obstacleGrid[0].length; i++) {
            if(obstacleGrid[0][i] == 1) {break;}
            res[0][i] = 1;
        }
        for(int i = 1; i < obstacleGrid.length; i++) {
            for(int j = 1; j < obstacleGrid[i].length; j++) {
                if(obstacleGrid[i-1][j] != 1) {
                    res[i][j] += res[i-1][j];
                }
                if(obstacleGrid[i][j-1] != 1) {
                    res[i][j] += res[i][j-1];
                }
                if(obstacleGrid[i][j] == 1) {
                    res[i][j] = 0;
                }
            }
        }
        return res[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}