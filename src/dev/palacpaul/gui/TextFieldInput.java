package dev.palacpaul.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldInput extends JFrame {

    private JTextField textField;
    private JButton buttonSubmit;
    private JLabel labelMessage;

    public TextFieldInput(){

            createView();

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Hello!~");
            setSize(400, 130);
            setLocationRelativeTo(null);
            setResizable(false);

    }

            private void createView() {
            JPanel panel = new JPanel();
            getContentPane().add(panel);

            JLabel label = new JLabel("Please enter your name: ");
            panel.add(label);

            textField = new JTextField();
            textField.setPreferredSize(new Dimension(180, 25));
            panel.add(textField);

            buttonSubmit = new JButton("Submit");
            buttonSubmit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = textField.getText();
                    if(name.isEmpty()){
                        labelMessage.setText("Unknown name!");
                    }else {
                        labelMessage.setText("Hello "+name +"! How are you?");
                    }
                }
            });
            panel.add(buttonSubmit);

            labelMessage = new JLabel(" Please enter your name!");
            panel.add(labelMessage);

        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldInput().setVisible(true);
            }
        });
    }
}
