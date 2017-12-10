import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
    private Piece[][] board;
    boolean endStartGame;

    public Model() {
        board = new Piece[8][8];
        endStartGame = true;
        setGameUp();
    }

    public void setGameUp() {
        int boardlength = board.length;
        board[0][0] = new Rook(0,0,false);
        board[0][1] = new Knight(0,1,false);
        board[0][2] = new Bishop(0,2,false);
        board[0][3] = new Queen(0,3, false);
        board[0][4] = new King(0,4,false);
        board[0][5] = new Bishop(0,5,false);
        board[0][6] = new Knight(0,6,false);
        board[0][7] = new Rook(0,7,false);
        for(int i = 0; i< boardlength; i++){
            board[1][i] = new Pawn(1,i,false);
        }
        for(int i = 0; i<boardlength; i++){
            board[boardlength-1][i] = new Pawn(boardlength-1, i, true);
            board[boardlength][0] = new Rook(0,0,false);
            board[boardlength][1] = new Knight(0,1,false);
            board[boardlength][2] = new Bishop(0,2,false);
            board[boardlength][3] = new Queen(0,3, false);
            board[boardlength][4] = new King(0,4,false);
            board[boardlength][5] = new Bishop(0,5,false);
            board[boardlength][6] = new Knight(0,6,false);
            board[boardlength][7] = new Rook(0,7,false);

        }
    }
}
