package sudoku_solver;
class SudokuSolver {

    public static boolean isSafe(char[][] board, int row, int col, int number){
        // row & col check
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }

        // 3x3 grid check
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i = sr; i < sr + 3; i++){
            for(int j = sc; j < sc + 3; j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }
        int nrows = 0;
        int ncols = 0;
        if(col != board.length - 1){
            nrows = row;
            ncols = col + 1;

        }else{
            nrows = row + 1;
            ncols = 0;
        }

        if(board[row][col] != '.'){
            if(helper(board, nrows, ncols)){
                return true;
            }
        }
        else{
            for(int i =  1; i <= 9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(helper(board, nrows, ncols)){
                        return true;
                    }else{
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }


    public static void solveSudoku(char[][] board){
        helper(board, 0, 0);

    }

    public static void main(String[] args) {
        char[][] board = {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        solveSudoku(board);

        System.out.println("Solved Sudoku: ");
        for(char[] x: board){
            for(char y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
