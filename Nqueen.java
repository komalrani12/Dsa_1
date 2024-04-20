public class Nqueen {
    public static boolean Issafe(char board[][], int row, int col){
        //vertically
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
            
        }
        //left diagonal
        for(int i=row-1, j=col-1; i>=0&j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1, j=col+1; i>=0 & j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return  false;
            }
        }
        return true;
    }
    
    
    public static boolean nqueen(char board[][], int row){
        if(row==board.length){
            // printBoard(board);
            count++;
            return true;
        }
        for(int j=0; j<board.length; j++){
            if(Issafe(board,row,j)){
                board[row][j]='Q';
               if( nqueen(board, row+1)){
                return true;
               }
                board[row][j]='X';
                
            }
        }
        return false;

    }
    public static void printBoard(char board[][]){
        System.out.println("------------chess board------------------");
        for(int i=0; i<board.length; i++){
            for( int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]){
        int n=2; 
        char board[][]=new char[n] [n];
        for(int i=0; i<n; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='X';
            }
                
    }  
    if(nqueen(board,0)){
        System.out.println("solution is possible");
        printBoard(board);
    }else{
        System.out.println("solution is not posible");
    }
   System.out.println("total ways to solve n queen=" +count);
    
}
}
