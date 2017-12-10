import javax.swing.*;

public class Main implements Runnable
{
    private Model model;
    private JFrame mainFrame;
    public Main(Model m)
    {
        //Applies model to global variable
        model =m;
    }
    @Override
    public void run()
    {
        //Creates Main JFrame
        mainFrame = new JFrame("Chess Game v0.1a");
        //Main Content Panel
        JPanel mainPanel = new JPanel();
        //Links Content Panel to the JFrame
        mainFrame.getContentPane().add(mainPanel);
        /**///////////

        //Loads GUI elements
        new GUI(model,mainPanel,this);
        //Makes Frame
        frameBasics(mainFrame);


    }
    public void updateJFrame()
    {
        frameUpdate(mainFrame);
    }
    public void frameUpdate(JFrame f)
    {
        f.pack();
        f.repaint();
    }
    public void frameBasics(JFrame f)
    {
        f.setVisible(true);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String args[])
    {
        //Creates Model
        Model m = new Model();
        SwingUtilities.invokeLater(new Main(m));
    }



}
