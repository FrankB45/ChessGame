package Pieces;

import Utils.Coordinate;

public class Piece
{
    Coordinate cords;
    int pieceType;
    //0=null 1=white 2=black
    boolean selected,bgColor;
    //bgColor will determine what that tiles color is black or white

    public Piece(int type, Coordinate cord)
    {
        pieceType = type;
        this.cords=cord;
    }
    public Piece()
    {
        pieceType=0;
        this.cords = new Coordinate(0,0);
    }
//    public void move(int changeinx, int changeiny){
//        if(pieceType == 1) {
//            cords.setX(cords.getX()-changeinx);;
//            cords.setY(cords.getY()-changeiny);
//        }else{
//            cords.setX(cords.getX()+changeinx);
//            cords.setY(cords.getY()+changeiny);
//        }
//    }

    public boolean hasMove()
    {
        if(selected){

        }
        return false;
    }
    public int getPieceType(){
        return pieceType;
    }

    public void setPieceType(int i){
        pieceType = i;
    }

    public boolean hasAttack()
    {return false;}

    public Coordinate getCords() {
        return cords;
    }
    public void setCords(Coordinate cord)
    {
        this.cords=cord;
    }

    public boolean isSelected(){
        return selected;
    }
    public void changeSelected(){selected=!selected;}

    public void movePiece(Coordinate coordinateToGo){
        cords.equals(coordinateToGo);
    }
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
