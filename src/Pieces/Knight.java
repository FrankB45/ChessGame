package Pieces;

public class Knight extends Piece {

    Coordinate coordinate;
    int type;
    boolean selected;

    public Knight(int type, int x, int y)
    {
        coordinate = new Coordinate(x,y);
        super.pieceType=type;
        super.selected = false;
    }

    @Override
    public boolean hasAttack()
    {
        if(selected)
        {

        }
        return false;
    }

    public Coordinate getCoorindates(){
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate){
        this.coordinate.equals(coordinate);
    }

    public boolean isSelected(){
        return selected;
    }
    public void changeSelected(){selected=!selected;}
}
