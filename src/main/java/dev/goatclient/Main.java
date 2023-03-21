package dev.goatclient;

import javax.swing.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main {
    public static void main(String[] args) {

        Bclass buttonWindow = new Bclass();
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        label.setForeground(new Color(175,238,238));
        label.setText("HEHE BOYY");
        buttonWindow.setSize(1200,730);
        buttonWindow.setTitle("GoatClient Dev Tool");
        buttonWindow.setVisible(true);
        buttonWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonWindow.setResizable(true);
        buttonWindow.getContentPane().setBackground(new Color(35,35,35));
        buttonWindow.add(label);

    }
}