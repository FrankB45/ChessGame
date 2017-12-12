package Pieces;

import Utils.Coordinate;

public class Knight extends Piece {
    int pieceOfTypeUnit = 4;
    public Knight(int type, Coordinate cord)
    {
        super(type, cord);
    }

    @Override
    public boolean hasAttack()
    {
        if(selected)
        {

        }
        return false;
    }

    public int pieceOfTypeUnit(){
        return pieceOfTypeUnit;
    }

}
