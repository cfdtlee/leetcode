public class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == 'O')
                bfs(board, i, 0, 'O', '?');
            if(board[i][board[0].length-1] == 'O')
                bfs(board, i, board[0].length-1, 'O', '?');
        }
        for(int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O')
                bfs(board, 0, i, 'O', '?');
            if(board[board.length-1][i] == 'O')
                bfs(board, board.length-1, i, 'O', '?');
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '?') board[i][j] = 'O';
            }
        }
    }
    void bfs(char[][] board, int i, int j, char from, char to) {
        if(board[i][j] == from) {
            board[i][j] = to;
        }
        else return;
        if(i+1 < board.length) bfs(board, i+1, j, from, to);
        if(i-1 > 0) bfs(board, i-1, j, from, to);
        if(j+1 < board[0].length)bfs(board, i, j+1, from, to);
        if(j-1 > 0) bfs(board, i, j-1, from, to);
    }
}