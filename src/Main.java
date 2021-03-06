
import sun.net.dns.ResolverConfiguration;

import javax.swing.*;

public class Main implements Runnable
{
    private JFrame mainFrame;
    public Main()
    {


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

        //Loads GUIForNewGame elements
        //new GUIForNewGame(this,mainPanel);
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
        if(args.length>0) {
            Model m = new Model();
            m.setGameUp();
            m.printBoard();

        }else
        {
            JFrame temp = new JFrame("Main");
            SwingUtilities.invokeLater(new Main());
            
        }
    }



}
