public class Piece
{
    int x,y,pieceType;
    boolean selected,bgColor;
    //bgColor will determine what that tiles color is black or white

    public Piece(boolean bg,int type, int x, int y)
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
    @Override
    public String toString()
    {
        if(pieceType==0)
            return "[ ]";
        else if(pieceType==1)
            return "[w]";
        else if(pieceType==2)
            return "[b]";
        return "[ ]";
    }



}
