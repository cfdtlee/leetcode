public class Solution {
    public void rotate(int[][] matrix) {
        int l = matrix.length-1;
        int temp;
        // for(int k = 0; k < (int)(l+1)/2; k++) {
            for(int i = 0; i < l; i++) {
                for(int j = i; j < l-i; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[l-j][i];
                    matrix[l-j][i] = matrix[l-i][l-j];
                    matrix[l-i][l-j] = matrix[j][l-i];
                    matrix[j][l-i] = temp;
                }
            }
        // }
    }
}