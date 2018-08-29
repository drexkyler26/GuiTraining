package dev.palacpaul.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TryGridBagLayout extends JFrame{
    private JButton buttonSubmit;

    public TryGridBagLayout(){
        createView();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void createView() {
        JPanel panelMain = new JPanel();
        panelMain.setBorder(new EmptyBorder(10, 10, 10, 10));
        getContentPane().add(panelMain);

        JPanel panelForm = new JPanel(new GridBagLayout());
        panelMain.add(panelForm);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        panelForm.add(new JLabel("First Name: "), c);
        c.gridy++;
        panelForm.add(new JLabel("Last Name: "), c);
        c.gridy++;
        panelForm.add(new JLabel("Email Address: "), c);
        c.gridy++;
        panelForm.add(new JLabel("User Name: "), c);
        c.gridy++;
        panelForm.add(new JLabel("Password: "), c);

        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        panelForm.add(new JTextField(8), c);
        c.gridy++;
        panelForm.add(new JTextField(8), c);
        c.gridy++;
        panelForm.add(new JTextField(14), c);
        c.gridy++;
        panelForm.add(new JTextField(10), c);
        c.gridy++;
        panelForm.add(new JPasswordField(10), c);
        c.gridy++;

        buttonSubmit = new JButton("Submit");
        panelForm.add(buttonSubmit, c);

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TryGridBagLayout();
            }
        });
    }
}
