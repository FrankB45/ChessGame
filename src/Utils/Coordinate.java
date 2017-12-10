package Utils;

public class Coordinate {
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Utils.Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean isEquals(Coordinate coordinate) {
        if(getX() == coordinate.getX() && getY() == coordinate.getY()){
            return true;
        }else{
            return false;
        }
    }

    public Coordinate equals(Coordinate coordinate){
        this.x = coordinate.getX();
        this.y = coordinate.getY();
        return new Coordinate(x,y);
    }
}
