package Pieces;

import Utils.Coordinate;

public class Piece
{
    Coordinate cords;
    int pieceType;
    boolean selected,bgColor;
    //bgColor will determine what that tiles color is black or white

    public Piece(boolean bg, int type, Coordinate cord)
    {
        pieceType = type;
        this.cords=cord;
    }
    public Piece()
    {
        pieceType=0;
        this.cords = new Coordinate(0,0);
    }
    public void move(int changeinx, int changeiny){
        if(pieceType == 1) {
            cords.setX(cords.getX()-changeinx);;
            cords.setY(cords.getY()-changeiny);
        }else{
            cords.setX(cords.getX()+changeinx);
            cords.setY(cords.getY()+changeiny);
        }
    }

    public boolean hasMove()
    {return false;}

    public boolean hasAttack()
    {return false;}

    public int getX(){
        return cords.getX();
    }
    public int getY(){
        return cords.getY();
    }
    public void setX(int x) {cords.setX(x); }
    public void setY(int y) {
        cords.setY(y);
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
