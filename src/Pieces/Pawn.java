package Pieces;
import Utils.Coordinate;

//all what the pieces classes should have is the props and how to get them all the movement is part of the model
public class Pawn extends Piece{
    int pieceOfTypeUnit = 5;
    public Pawn(int type, Coordinate cord)
    {
        super(type,cord);
    }

    public int getPieceOfTypeUnit(){
        return pieceOfTypeUnit;
    }
}

