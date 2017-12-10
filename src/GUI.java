import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class GUI implements Observer
{
    private Model model;

    private Main main;

    public GUI( JPanel mPanel, Main main)
    {
        this.main = main;
        JLabel label = new JLabel("Stringsss");
        mPanel.add(label);
        main.updateJFrame();

    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
