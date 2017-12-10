public class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
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
        return "Coordinate{" +
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
}
