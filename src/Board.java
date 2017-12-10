import
import Pieces.*
public class Board {
    private Piece[][] board;

    public Board(){
        board = new Piece[8][8];
    }

    public Piece[][] getBoardPiece() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    public void setGameUp() {
        int boardlength = board.length;
        for(int i = 0; i<boardlength; i++){
            for(int j = 0; j<boardlength; j++){
                if(i == 0){
                    board[0][0] = new Rook(1,0,0);
                    board[0][1] = new Knight(1,0,1);
                    board[0][2] = new Bishop(1,0,2);
                    board[0][3] = new Queen(1,0,3);
                    board[0][4] = new King(1,0,4);
                    board[0][5] = new Bishop(1,0,5);
                    board[0][6] = new Knight(1,0,6);
                    board[0][7] = new Rook(1,0,7);
                } else if(i == 1 || i == boardlength-1){
                    for(int q = 0; q < boardlength; q++){
                        board[1][q] = new Pawn(1,1, q);
                    }

                } else if(i == boardlength-1){
                    board[0][0] = new Rook(2,0,0);
                    board[0][1] = new Knight(2,0,1);
                    board[0][2] = new Bishop(2,0,2);
                    board[0][3] = new Queen(2,0,3);
                    board[0][4] = new King(2,0,4);
                    board[0][5] = new Bishop(2,0,5);
                    board[0][6] = new Knight(2,0,6);
                    board[0][7] = new Rook(2,0,7);

                }else if(i == boardlength-1){
                    for(int q = 0; q < boardlength; q++){
                        board[1][q] = new Pawn(2,1, q);
                    }
                }else{
                    board[i][j] = null;
                }
            }
        }
    }

    public Piece getTile(Coordinate coordinate){
        return board[coordinate.getX()][coordinate.getY()];
    }

    public void seTile(Piece piece, Coordinate coordinate){
        board[coordinate.getX()][coordinate.getY()] = piece;
    }
}
