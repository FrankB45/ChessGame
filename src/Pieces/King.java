package Pieces;

import Utils.Coordinate;

public class King extends Piece {
    int pieceOfTypeUnit = 0;
    public King(int type, Coordinate cord)
    {

        super(type,cord);
    }
    public int pieceOfTypeUnit(){
        return pieceOfTypeUnit;
    }



}
