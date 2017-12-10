import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class GUI implements Observer
{
    private Model model;
    private Main main;

    public GUI(Model m, JPanel mPanel, Main main)
    {
        model = m;
        this.main = main;

    }
    @Override
    public void update(Observable o, Object arg)
    {

    }
}
