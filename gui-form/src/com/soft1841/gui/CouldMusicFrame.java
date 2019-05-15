package com.soft1841.gui;

import javax.swing.*;

public class CouldMusicFrame {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JButton 搜索Button;
    private JButton 发现Button;
    private JButton MVButton;
    private JButton 朋友Button;
    private JPanel centerPanel;
    private JLabel buttomLabel;
    private JLabel rightLabel;
    private JPanel musicPanel;
    private JLabel music1Label;
    private JLabel music2Label;
    private JLabel music3Label;
    private JLabel music4Label;
    private JLabel music5Label;

    public static void main(String[] args) throws Exception {
        //根据系统设置Swing外观
String lookAndFeel=UIManager.getSystemLookAndFeelClassName();
UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("CouldMusicFrame");
        frame.setContentPane(new CouldMusicFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
