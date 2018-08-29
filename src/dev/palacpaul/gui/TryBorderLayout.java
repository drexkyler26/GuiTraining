package dev.palacpaul.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryBorderLayout extends JFrame{

    private JButton buttonSubmit,buttonClear;
    private JTextField fieldMessage;
    private JTextArea textArea;

    public TryBorderLayout(){
        createView();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setMinimumSize(new Dimension(400, 200));
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void createView() {
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        JPanel panelNorth = new JPanel(new BorderLayout());
        panel.add(panelNorth, BorderLayout.NORTH);
        panelNorth.add(new JLabel("ENTER MESSAGE:"), BorderLayout.WEST);

        fieldMessage = new JTextField();
        panelNorth.add(fieldMessage, BorderLayout.CENTER);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = fieldMessage.getText();
                fieldMessage.setText("");
                textArea.append(message + "\n");
            }
        });
        panelNorth.add(buttonSubmit, BorderLayout.EAST);


        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        JPanel panelSouth = new JPanel();
        panel.add(panelSouth, BorderLayout.SOUTH);

        buttonClear = new JButton("Clear");
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        panelSouth.add(buttonClear);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TryBorderLayout();
            }
        });
    }
}
