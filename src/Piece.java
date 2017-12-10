public abstract class Piece{
    int x;
    int y;
    boolean selected;


    public void move(int changeinx, int changeiny){
        x-=changeinx;
        y-=changeiny;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void isSelected(){
        selected = true;
    }




}
