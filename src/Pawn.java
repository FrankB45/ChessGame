//all what the pieces classes should have is the props and how to get them all the movement is part of the model
public class Pawn extends Piece{
    Coordinate coordinate;
    int type;
    int pointValue = 1;
    boolean selected;

    public Pawn(int type, int x, int y)
    {
        coordinate = new Coordinate(x,y);
        this.type=type;
        selected = false;
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

