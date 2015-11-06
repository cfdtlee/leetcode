public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid = 0;
        int row = matrix.length, col = matrix[0].length;
        int begin = 0, end = row * col-1;
        while(begin <= end) {
            mid = begin + (end - begin)/2;
            if(matrix[mid/col][mid%col] == target) return true;
            if(matrix[mid/col][mid%col] < target) begin = i+1;
            else end = i - 1;
        }
        return false;
    }
}