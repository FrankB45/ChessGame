package Pieces;

public class Bishop extends Piece {
    Coordinate coordinate;
    int type;
    int pointValue = 1;
    boolean selected;

    public Bishop(int type, int x, int y)
    {
        coordinate = new Coordinate(x,y);
        super.pieceType=type;
        super.selected = false;
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
    public void changeSelected(){
        selected=!selected;
    }

}
