package dev.palacpaul.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickMeButton extends JFrame {

    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;
  

    private int clicks = 0;

    public ClickMeButton(String title, int width, int height){
        createView();

        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(width, height));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200, 30));
        panel.add(labelCount);
        
        updateCounter();

        buttonCounter = new JButton("Click Me!");
        buttonCounter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks++;
                updateCounter();
            }
        });
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks = 0;
                updateCounter();
            }
        });
        panel.add(buttonReset);

    }


    private void updateCounter() {

        labelCount.setText("Clicked " +clicks +" times");
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClickMeButton("Click Me", 400, 80);
            }
        });

    }

}

