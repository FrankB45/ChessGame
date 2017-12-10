public abstract class Piece{
    int x;
    int y;
    boolean selected;
    int pointValue = 1;
    String color;

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
