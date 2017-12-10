public abstract class Piece
{
    int x,y,pieceType;
    boolean selected;

    public Piece(int type, int x, int y)
    {
        pieceType = type;
        this.x=x;
        this.y=y;
    }
    public Piece()
    {
        pieceType=0;
        this.x=0;
        this.y=0;
    }
    public void move(int changeinx, int changeiny){
        if(pieceType == 1) {
            x -= changeinx;
            y -= changeiny;
        }else{
            x+= changeinx;
            y+= changeiny;
        }
    }

    public boolean hasMove()
    {return false;}

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
