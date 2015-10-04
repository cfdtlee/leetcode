public class Solution {
    int[] col = {-1, 1, 0, 0}; //up, down, left, right
    int[] row = {0, 0, -1, 1};
    public boolean exist(char[][] board, String word) {
        if(board.length == 0) return false;
        Boolean[][] isVisited = new Boolean[board.length][board[0].length];
        for(Boolean[] t : isVisited) {
            Arrays.fill(t, false);
        }
        return dfs(board, word, 0, 0, 0, isVisited);
    }
    Boolean dfs(char[][] board, String word, int match, int x, int y, Boolean[][] isVisited) {
        int i, j;
        Boolean b1 = false;
        if(word.length() == match) {return true;}
        if(match == 0) {
            for(i = 0; i < board.length; i++) {
                for(j = 0; j < board[i].length; j++) {
                    if(board[i][j] == word.charAt(match)) {
                        isVisited[i][j] = true;
                        b1 = dfs(board, word, match+1, i, j, isVisited);
                        if(b1) return true;
                        isVisited[i][j] = false;
                    }
                }
            }
            return false;
        }
        else {
            int k = 0;
            Boolean bool = false;
            for(k = 0; k < 4; k++) {
                int xNew = x+row[k];
                int yNew = y+col[k];
                if(xNew >= 0 && xNew < board.length && yNew >= 0 && yNew < board[xNew].length && word.charAt(match) == board[xNew][yNew] && !isVisited[xNew][yNew]) {
                    isVisited[xNew][yNew] = true;
                    bool = bool || dfs(board, word, match+1, xNew, yNew, isVisited);
                    if(bool) return true;
                    isVisited[xNew][yNew] = false;
                }
            }
            return bool;
        }
    }
}


public class Solution {
    int[] col = {-1, 1, 0, 0}; //up, down, left, right
    int[] row = {0, 0, -1, 1};
    public boolean exist(char[][] board, String word) {
        if(board.length == 0) return false;
        Boolean[][] isVisited = new Boolean[board.length][board[0].length];
        for(Boolean[] t : isVisited) {
            Arrays.fill(t, false);
        }
        Boolean bool = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(word.charAt(0) == board[i][j]){
                    isVisited[i][j] = true;
                    bool = dfs(board, word, 1, i, j, isVisited);
                    isVisited[i][j] = false;
                    if(bool) return true;
                }
            }
        }
        return false;
    }
    Boolean dfs(char[][] board, String word, int match, int x, int y, Boolean[][] isVisited) {
        // System.out.println(x);
        int k = 0;
        Boolean bool = false;
        if(word.length() == match) {return true;}
        for(k = 0; k < 4; k++) {
            int xNew = x+col[k]; // -1, 1, 0, 0
            int yNew = y+row[k]; // 0, 0, -1, 1
            if(xNew >= 0 && xNew < board.length && yNew >= 0 && yNew < board[xNew].length && word.charAt(match) == board[xNew][yNew] && !isVisited[xNew][yNew]) {
                // System.out.println("never say never");
                isVisited[xNew][yNew] = true;
                bool = bool || dfs(board, word, match+1, xNew, yNew, isVisited);
                if(bool) return true;
                isVisited[xNew][yNew] = false;
            }
        }
        return bool;
    }
}