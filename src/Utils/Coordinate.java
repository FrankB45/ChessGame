package Utils;

public class Coordinate {
    private int Col;
    private int Row;

    public Coordinate(int Row, int Col) {
        this.Row = Row;

        this.Col = Col;
    }

    public int getCol() {
        return Col;
    }

    public void setCol(int col) {
        Col = col;
    }

    public int getRow() {
        return Row;
    }

    public void setRow(int row) {
        Row = row;
    }

    @Override
    public String toString() {
        return "Utils.Coordinate{" +
                "x=" + Col +
                ", y=" + Row +
                '}';
    }

    public boolean isEquals(Coordinate coordinate) {
        if(getRow() == coordinate.getRow() && getCol() == coordinate.getCol()){
            return true;
        }else{
            return false;
        }
    }

    public Coordinate equals(Coordinate coordinate){
        this.Row= coordinate.getRow();
        this.Col = coordinate.getCol();
        return new Coordinate(Row,Col);
    }
}
