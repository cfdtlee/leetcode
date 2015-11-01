public class Solution {
    public void solve(char[][] board) {
        if(board.length == 0 || board[0].length == 0) return;
        Queue<Point> queue = new LinkedList<Point>();
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == 'O')
                queue.add(new Point(i, 0));
            if(board[i][board[0].length-1] == 'O')
                queue.add(new Point(i, board[0].length-1));
        }
        for(int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O')
                queue.add(new Point(0, i));
            if(board[board.length-1][i] == 'O')
                queue.add(new Point(board.length-1, i));
        }
        while(!queue.isEmpty()) {
            Point p = queue.poll();
            board[p.i][p.j] = '?';
            if(p.i+1 < board.length && board[p.i+1][p.j] == 'O') queue.add(new Point(p.i+1, p.j));
            if(p.i-1 >= 0 && board[p.i-1][p.j] == 'O') queue.add(new Point(p.i-1, p.j));
            if(p.j+1 < board[0].length && board[p.i][p.j+1] == 'O') queue.add(new Point(p.i, p.j+1));
            if(p.j-1 >= 0 && board[p.i][p.j-1] == 'O') queue.add(new Point(p.i, p.j-1));
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '?') board[i][j] = 'O';
            }
        }
    }
}
class Point{
    int i;
    int j;
    Point(int i, int j) {this.i = i; this.j = j;}
}