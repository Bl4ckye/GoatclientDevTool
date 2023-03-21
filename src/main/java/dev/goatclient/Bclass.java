package dev.goatclient;

import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bclass extends JFrame {
    private JButton bleft, bright, bmiddle, bspin;

    public Bclass(){
        //window settings and things
            super("Button");
            setLayout(new FlowLayout());
        //renders the buttons
            bleft = new JButton("left");
            bright = new JButton("right");
            bmiddle = new JButton("middle");
            add(bleft);
            add(bmiddle);
            add(bright);

        DerHandler handler = new DerHandler();
        bleft.addActionListener(handler);
        bright.addActionListener(handler);
        bmiddle.addActionListener(handler);
    }
    private class DerHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource()==bleft)
                JOptionPane.showMessageDialog(null, "left");
            else if(event.getSource()==bright)
                JOptionPane.showMessageDialog(null, "right");
            else if (event.getSource()==bmiddle) {
                JOptionPane.showMessageDialog(null, "middle");
            }
        }
    }
}
