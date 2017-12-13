package Pieces;
import Utils.Coordinate;

import java.util.ArrayList;

//all what the pieces classes should have is the props and how to get them all the movement is part of the model
public class Pawn extends Piece{
    public Pawn(int type, Coordinate cord)
    {
        super(type,cord, 5);
    }
    public ArrayList<Coordinate> validSpots()
    {
        while(isSelected())
        {
            ArrayList<Coordinate> ret = new ArrayList<Coordinate>();
            if(pieceType==1)
            {
                if(getCords().getRow()==6)
                {

                }

            }
        }

    }

}

