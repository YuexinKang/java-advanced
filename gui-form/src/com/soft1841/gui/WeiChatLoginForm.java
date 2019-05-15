package com.soft1841.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeiChatLoginForm {
    private JPanel mainPanel;
    private JLabel avatarLabel;
    private JLabel nameLabel;
    private JButton button1;

    public WeiChatLoginForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"登录成功");
            }
        });
    }

    public static void main(String[] args) {
       // UIManager.setLookAndFeel("com.sun.java.swing.plaf.window.WindowsLookAndFeel");
        JFrame frame = new JFrame("WeiChatLoginForm");
        frame.setContentPane(new WeiChatLoginForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
