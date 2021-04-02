import sun.java2d.SunGraphics2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayingFiled extends JFrame implements MouseListener {

    JPanel squares [][] = new JPanel[12][12];
    public PlayingFiled() {

        this.setSize(500, 500);
        this.setLayout(new GridLayout(12, 12));
        this.setVisible(true);


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                squares[i][j] = new JPanel();
                SunGraphics2D g;


                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.RED);
                } else {
                    squares[i][j].setBackground(Color.yellow);
                }
                this.add(squares[i][j]);
            }
        }
    }

// Незнам как искате да направим игра която е с размера на курсовия проект за 4 часа .....
// Но аз не съм достатъчно квалифициран за да слагам логиката ви под въпрос.....

// PS. - Поне задачите са интересни.
















    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
