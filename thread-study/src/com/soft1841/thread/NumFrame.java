package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NumFrame extends JFrame {
    private JLabel numberLabel;

    public NumFrame(){
        init();
        setTitle("随机数窗口");
        setSize(400,700);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void  init(){
        numberLabel=new JLabel("随机数");
        Font font=new Font("微软雅黑",Font.BOLD,50);
        numberLabel.setFont(font);
        setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(numberLabel);
        NumThread numThread=new NumThread();
        numThread.setNumberLabel(numberLabel);
        numThread.start();

    }


    public static void main(String[] args) {
        new NumFrame();
    }
}
