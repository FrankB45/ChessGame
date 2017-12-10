package Pieces;

public class Rook extends Piece {

    int type;
    boolean selected;
    Coordinate coordinate;

    public Rook(int type, int x, int y) {
        super.pieceType = type;
        super.selected = false;
        coordinate = new Coordinate(x,y);
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
