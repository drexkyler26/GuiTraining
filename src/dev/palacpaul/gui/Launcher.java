package dev.palacpaul.gui;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    private int width, height;
    private String title;

    public Launcher(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        createLauncher();
    }

    public void createLauncher() {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setBackground(Color.BLACK);

        JButton button = new JButton("Button");
        panel.add(button);
        JButton button2 = new JButton("Button2");
        panel.add(button2);
        JButton button3 = new JButton("Click Me!");
        panel.add(button3);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 25));
        panel.add(textField);

    }
}
