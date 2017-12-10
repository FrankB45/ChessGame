import javax.swing.*;
import java.util.ArrayList;

public class Model {
    private Piece[][] board;
    boolean endStartGame;

    public Model() {
        board = new Piece[8][8];
        endStartGame = true;
        setGameUp();
    }

    public void setGameUp() {
        int boardlength = board.length;
        board[0][0] = new Rook(1,0,0);
        board[0][1] = new Knight(1,0,1);
        board[0][2] = new Bishop(1,0,2);
        board[0][3] = new Queen(1,0,3);
        board[0][4] = new King(1,0,4);
        board[0][5] = new Bishop(1,0,5);
        board[0][6] = new Knight(1,0,6);
        board[0][7] = new Rook(1,0,7);
        for(int i = 0; i< boardlength; i++){
            board[1][i] = new Pawn(1,1, i);
        }
        for(int i = 0; i<boardlength; i++){
            board[boardlength-1][i] = new Pawn(2, boardlength-1, i);
        }
        board[boardlength][0] = new Rook(boardlength,0,0);
        board[boardlength][1] = new Knight(boardlength,0,1);
        board[boardlength][2] = new Bishop(boardlength,0,2);
        board[boardlength][3] = new Queen(boardlength,0,3);
        board[boardlength][4] = new King(boardlength,0,4);
        board[boardlength][5] = new Bishop(boardlength,0,5);
        board[boardlength][6] = new Knight(boardlength,0,6);
        board[boardlength][7] = new Rook(boardlength,0,7);
    }

    public Piece[][] getBoard() {
        return board;
    }
}
