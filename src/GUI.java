import javax.swing.*;
import java.awt.*;

public class GUI
{
    private Model model;
    private Main main;
    JLabel[][] board;

    public GUI(Model _model, JPanel mainPanel, Main main)
    {
        model = _model;
        this.main = main;
        JPanel gameFrame = new JPanel(new GridLayout(8,8));
        mainPanel.add(gameFrame);
        board = model.getBoard();

    }
    public void update()
    {

    }

    public void addLabelToBoard(){
       for(int i = 0; i<model.getBoard().length; i++){
           for(int j = 0; j<model.getBoard().length; j++) {
           JButton button = new JButton();
           button = model.getBoard()[i][j];
           }
       }
    }
}
