package Pieces;

import Utils.Coordinate;
public class Bishop extends Piece {
    int pieceOfTypeUnit = 4;
    public Bishop(int type, Coordinate cord)
    {
        super(type,cord);
    }

    public int pieceOfTypeUnit(){
        return pieceOfTypeUnit;
    }
}
