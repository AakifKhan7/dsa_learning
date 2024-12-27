import java.util.ArrayList;
import java.util.List;

class BackQ2 {

    public boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // upper left
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // upper right
        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // lower left
        for(int i = row, j = col; i < board.length && j >= 0; i++, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // lower right
        for(int i = row, j = col; i < board.length && j < board.length; i++, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allborad){
        String row = "";
        List<String> newboard = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            row = "";
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newboard.add(row);
        }
        allborad.add(newboard);
    }

    public void helper(char[][] board, List<List<String>> allborad, int col){

        if(col == board.length){
            saveBoard(board, allborad);
            return;
        }

        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allborad, col + 1);
                board[row][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allborad = new ArrayList<>();

        char[][] board = new char[n][n];

        helper(board, allborad, 0);
        return allborad;
    }
    

    // time complexity: O(n ^ n)
    public static void main(String[] args) {
        BackQ2 q2 = new BackQ2();
        List<List<String>> allborad = q2.solveNQueens(4);
        for(List<String> board : allborad){
            for(String row : board){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
