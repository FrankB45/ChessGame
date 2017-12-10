
public class Rook extends Piece {
    int x;
    int y;
    int type;
    boolean selected;
    public Rook(int type, int x, int y) {
    this.type = type;
    this.x = x;
    this.y = y;

    }
    public boolean hasMove()
    {
        if(type == 1){

        }

        }

    public boolean hasAttack()
    {return false;}

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
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
