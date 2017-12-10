public class Pawn extends Piece{
    int x;
    int y;
    boolean selected;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
        selected = false;
    }


    @Override
    public void move(int changeinx, int changeiny) {

        super.move(changeinx, changeiny);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }


    @Override
    public void isSelected() {
        selected = true;
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
