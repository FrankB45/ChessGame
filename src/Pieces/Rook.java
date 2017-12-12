package Pieces;

import Utils.Coordinate;

public class Rook extends Piece {
    int pieceOfTypeUnit = 3;

    public Rook(int type, Coordinate cord)
    {
        super(type, cord);
    }

    public int pieceOfTypeUnit(){
        return pieceOfTypeUnit;
    }

}
