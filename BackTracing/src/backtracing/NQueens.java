package backtracing;

public class NQueens {
    public static void main(String[] args) {
        int n=3;
        char[][] board = new char[n][n]; //char board
        for (int i=0; i<n;i++){
            for (int j=0; j<n; j++){
                board[i][j] ='X';// travel thought the array and fill the board with X
            }
        }
        nqueens(board,0/*row number*/);
/*        board will be passed to the method which will give me valid placing of queens*/
    }

    private static void nqueens(char[][] board, int row /*this will decide which row will be placed with queens*/) {
        int n = board.length;
        //when row == n then i will print the board\
        if (row == n){
            for (int i=0;i<n; i++){
                for (int j=0; j<n; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;  // once board is printed then return
        }

/*now i will travel though the row
* i will be having row and the travel the row and places the queens */
//        the j will be my colum since instanceof hv got row already

        for(int j=0;j<n; j++){
            //now i will check the column of the board by checking is tht cell
//            is safe or not by passing board row and column : j, then place the queen
            if(isSafe(board,row,j)) { //if safe then only instanceof will place Queen
                board[row][j] = 'Q'; //now i found the safe place and i placed the
                // queen then now i will tell recursion to fill the next now though recursion

                nqueens(board,row+1); // now if the places are filled the i will do back tracking
//                by filling or making it x
                board[row][j] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        /*when will be the cell of a particular board will be safe
        * so check the row fully(row will be constant for each row traversing
        * and check the column( column will be changing)
        * if any where Q is found then
        * return false
        * similarly
        * check the column by changing the row
        * where row will be changing and column will be same
        * if queen is placed then return false
        * now
        * check with the diagonals:
        *
        * */
        //check row
        int n = board.length;
        for (int j=0; j<n; j++){
            if (board[row][j] == 'Q')
                return false;
        }
        // check the column
        for (int i=0; i<n; i++){ //i will be denoting as row
            if(board[i][col] == 'Q')
                 return false;
        }

        //now checking the diagonals
        /*check north east
        * check south east
        * check south west
        * check north west
        * */

        int i = row;
        int j = col;
        while (i>=0 && j<n){
            if (board[i][j]=='Q')
                return false;
            i--;
            j++;
        }

        i = row;
        j = col;
        while (i<n && j<n){ //since both are increasing
            if (board[i][j]=='Q')
                return false;
            i++;
            j++;
        }
//after every diagonal check i need to bring my i and j to the same position
        i = row;
        j = col;
        while (i<n && j>=0){ // j is decreasing so make the j ==0
            if (board[i][j]=='Q')
                return false;
            i++;
            j--;
        }

        i = row;
        j = col;
        while (i>=0 && j>=0){ // i and j both are decreasing
            if (board[i][j]=='Q')
                return false;
            i--;
            j--;
        }
        return true;
    }
}
