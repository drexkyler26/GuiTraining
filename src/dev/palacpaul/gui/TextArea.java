package dev.palacpaul.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea extends JFrame {

    private JTextArea textArea;
    private JButton buttonClear;
    private JButton buttonSubmit;
    private JTextField fieldMessage;


    public TextArea(){
        createView();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Text Area");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel label = new JLabel("ENTER TEXT:");
        panel.add(label);

        fieldMessage = new JTextField(12);
        fieldMessage.setBackground(Color.GRAY);
        panel.add(fieldMessage);

        buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = fieldMessage.getText();
                fieldMessage.setText("");
                textArea.append(message + "\n");
            }
        });
        buttonSubmit.setBackground(Color.RED);
        panel.add(buttonSubmit);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(Color.pink);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(350, 80));
        panel.add(scrollPane);

        buttonClear = new JButton("CLEAR");
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        panel.add(buttonClear);
        buttonClear.setBackground(Color.BLUE);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextArea().setVisible(true);
            }
        });
    }
}
