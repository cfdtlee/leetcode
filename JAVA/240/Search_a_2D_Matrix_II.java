public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchMatrix(matrix, target, 0, matrix.length-1, 0, matrix[0].length-1);//i2 and j2 should be matrix.length-1 and ...
    }
    boolean searchMatrix(int[][] matrix, int target, int i1, int i2, int j1, int j2) {
        if(i1 > i2 || j1 > j2 || i1 < 0 || j1 < 0 || i2 >= matrix.length || j2 >= matrix[0].length) return false; //bug easy happen
        int im = (i1 + i2)/2, jm = (j1 + j2)/2;
        int mid = matrix[im][jm];
        if(mid == target) return true;
        // if mid > target, target cannot be in downright
        // then search upleft, upright, downleft 左上，右上，左下
        else if(mid > target) return searchMatrix(matrix, target, i1, im, j1, jm-1) || searchMatrix(matrix, target, i1, im-1, jm, j2) || searchMatrix(matrix, target, im+1, i2, j1, jm-1);
        // 右上，左下，右下
        else return searchMatrix(matrix, target, i1, im, jm+1, j2) || searchMatrix(matrix, target, im+1, i2, j1, jm) || searchMatrix(matrix, target, im+1, i2, jm+1, j2);
    }
}