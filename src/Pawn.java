//all what the pieces classes should have is the props and how to get them all the movement is part of the model
public class Pawn extends Piece{
    Coordinate coordinate;
    int type;
    boolean selected;

    public Pawn(int type, int x, int y)
    {
        coordinate = new Coordinate(x,y);
        this.type=type;
        selected = false;
    }

    public boolean howToMove()
    {
        if(type == 1)
        {
            y -=1;
        }else{
            y = Math.abs(y-1);
        }
        return false;
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
        setX(coordinate.getX());
        setY(coordinate.getY());
    }

    }

