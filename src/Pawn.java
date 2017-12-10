public class Pawn extends Piece{
    int x;
    int y;
    int type;
    boolean selected;

    public Pawn(int type, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.type=type;
        selected = false;
    }

    @Override
    public boolean hasMove()
    {
        if(selected)
        {

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
}
