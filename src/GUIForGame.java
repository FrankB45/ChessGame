import Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIForGame {
    Model model;
    JPanel gamePanel;
    int index = 0;
    public GUIForGame(Model m, Main main, JPanel gamePanel){
        model = m;
        this.gamePanel= gamePanel;
        JPanel boardPanel = new JPanel(new GridLayout([8][8]);
        for(int i = 0; i< model.getBoard().length; i++){
            for(int j = 0; j< model.getBoard()[i].length; j++){
            JButton boardbtn = new JButton();
            boardbtn = buttonProperties(boardbtn, i, j);
            boardPanel.add(boardbtn);
            }
        }
    }

    private JButton buttonProperties(JButton boardbtn, int i, int j) {
        if(index%2 == 0){
            boardbtn.setBackground(Color.WHITE);
        }else {
            boardbtn.setBackground(Color.BLACK);
        }
        index++;
        boardbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(model.getBoard()[i][j].getPieceType() == 0 ){
                    
                }
                Piece piece = ;
                piece = piece.changeSelected(true);
            }
        });
        return boardbtn;
    }


}
