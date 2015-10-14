public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int col = matrix.length, row = matrix[0].length, max = 0;
        int[][] count = new int[col][row];
        for(int i = 0; i < col; i++) count[i][0] = matrix[i][0] - '0';
        for(int i = 0; i < row; i++) count[0][i] = matrix[0][i] - '0';
        for(int i = 1; i < col; i++) {
            for(int j = 1; j < row; j++) {
                // when there are two matrix, pay attention to choosing matrix
                count[i][j] = matrix[i][j] == '0' ? 0 : 1 + Math.min(count[i-1][j], Math.min(count[i][j-1], count[i-1][j-1]));
            }
        }
        for(int i = 0; i < col; i ++) {
            for(int j = 0; j < row; j++) {
                max = Math.max(max, count[i][j]);
            }
        }
        return max * max;
    }
}


public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int col = matrix.length+1, row = matrix[0].length+1, max = 0;
        int[][] count = new int[col][row];
        for(int i = 1; i < col; i++) {
            for(int j = 1; j < row; j++) {
                // when there are two matrix, pay attention to choosing matrix
                count[i][j] = matrix[i-1][j-1] == '0' ? 0 : 1 + Math.min(count[i-1][j], Math.min(count[i][j-1], count[i-1][j-1]));
                max = Math.max(max, count[i][j]);
            }
        }
        return max * max;
    }
}


