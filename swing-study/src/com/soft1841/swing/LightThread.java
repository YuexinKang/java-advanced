package com.soft1841.swing;

import javax.swing.*;

public class LightThread extends Thread {
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(LightFrame.class.getResource("/img/yellow.jpg")));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(LightFrame.class.getResource("/img/red.jpg")));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(LightFrame.class.getResource("/img/green.jpg")));

        }

    }

    public static void main(String[] args) {
        LightThread lt=new LightThread();
        lt.start();

    }
}
