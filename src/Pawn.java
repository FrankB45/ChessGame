public class Pawn extends Piece{
    Coordinate coordinate;
    int type;
    boolean selected;

    public Pawn(int type, Coordinate coordinate)
    {
        this.coordinate = coordinate;
        this.type=type;
        selected = false;
    }

    @Override
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

    public boolean isMoveValid(int Tox, int Toy){
        if(x - Tox >1 || y-Toy > 1){
            return false;
        }else{
            x-=Tox;
            y-=Toy;
            return true;
        }
    }
    public move(int x , int y){

    }
}
