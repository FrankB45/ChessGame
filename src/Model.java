import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable {
    boolean endStartGame;
    Board board;

    public Model() {
        endStartGame = true;
        board = new Board();
    }




}
