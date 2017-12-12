package Pieces;

import Utils.Coordinate;

public class Queen extends Piece {
    int pieceOfTypeUnit = 1;


    public int pieceOfTypeUnit(){
        return pieceOfTypeUnit;
    }
    public Queen(int type, Coordinate cord)
    {
        super(type,cord);
    }



}
