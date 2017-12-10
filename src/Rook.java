
public class Rook extends Piece {
    int x;
    int y;
    int type;
    boolean selected;
    Coordinate coordinate;
    public Rook(int type, int x, int y) {
    this.type = type;
    coordinate = new Coordinate(x,y);
    }

    public Coordinate getCoorindates(){
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate){
        setX(coordinate.getX());
        setY(coordinate.getY());
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public boolean isSelected(){
        return selected;
    }
    public void changeSelected(){selected=!selected;}
}
