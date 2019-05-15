package com.soft1841.thread;

import javax.swing.*;

public class CarouselFrame extends JFrame {
    private JLabel imgLabel;
    public CarouselFrame(){
        init();
        setTitle("轮播窗体");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        imgLabel=new JLabel();
        add(imgLabel);
        CarouselThread ct=new CarouselThread();
        ct.setImgLabel(imgLabel);
        new Thread(ct).start();
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }




}
