import Pieces.*;
import Utils.Coordinate;

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
        initBoard();

    }

    public Piece[][] getBoard() {
        return board;
    }

    public void initBoard() {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = new Piece(0, new Coordinate(0, 0));

        int boardlength = board.length;
        board[0][0] = new Rook(1, new Coordinate(0, 0));
        board[0][1] = new Knight(1, new Coordinate(0, 1));
        board[0][2] = new Bishop(1, new Coordinate(0, 2));
        board[0][3] = new Queen(1, new Coordinate(0, 3));
        board[0][4] = new King(1, new Coordinate(0, 4));
        board[0][5] = new Bishop(1, new Coordinate(0, 5));
        board[0][6] = new Knight(1, new Coordinate(0, 6));
        board[0][7] = new Rook(1, new Coordinate(0, 7));
        for (int i = 0; i < boardlength; i++) {
            board[1][i] = new Pawn(1, new Coordinate(1, i));
        }
        for (int i = 0; i < boardlength; i++) {
            board[boardlength - 2][i] = new Pawn(2, new Coordinate(boardlength - 2, i));
        }
        board[boardlength - 1][0] = new Rook(2, new Coordinate(boardlength - 1, 0));
        board[boardlength - 1][1] = new Knight(2, new Coordinate(boardlength - 1, 1));
        board[boardlength - 1][2] = new Bishop(2, new Coordinate(boardlength - 1, 2));
        board[boardlength - 1][3] = new Queen(2, new Coordinate(boardlength - 1, 3));
        board[boardlength - 1][4] = new King(2, new Coordinate(boardlength - 1, 4));
        board[boardlength - 1][5] = new Bishop(2, new Coordinate(boardlength - 1, 5));
        board[boardlength - 1][6] = new Knight(2, new Coordinate(boardlength - 1, 6));
        board[boardlength - 1][7] = new Rook(2, new Coordinate(boardlength - 1, 7));
        notifyObservers();
    }

    public void printBoard() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++)
                System.out.print(board[i][j].toString());
            System.out.println();
        }
    }
}
