package com.soft1841.gui;

import javax.swing.*;

public class QIYNewsFrame {
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JButton 咨询Button;
    private JButton 娱乐Button;
    private JButton 搞笑Button;
    private JButton 时尚Button;
    private JButton 片花Button;
    private JButton 动漫Button;
    private JLabel leftnewsPanel;
    private JPanel rightPanel;
    private JPanel firstPanel;
    private JLabel new1Label;
    private JLabel new2Label;
    private JPanel secondPanel;
    private JLabel new3Label;
    private JLabel new4Label;
    private JPanel thridPanel;
    private JLabel new5Label;
    private JLabel new6Label;

    public static void main(String[] args)throws Exception {
        String lookAndFeel=UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("QIYNewsFrame");
        frame.setContentPane(new QIYNewsFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
