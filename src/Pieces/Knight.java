package Pieces;

import Utils.Coordinate;

public class Knight extends Piece {
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

}
