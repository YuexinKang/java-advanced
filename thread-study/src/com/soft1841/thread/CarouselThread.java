package com.soft1841.thread;

import javax.swing.*;
import java.io.*;

public class CarouselThread implements Runnable {
    private JLabel imgLabel;
    private String[]  imgs={"D:/carousel/1.jpg","D:/carousel/2.jpg","D:/carousel/3.png","D:/carousel/4.jpg","D:/carousel/5.jpg",
            "D:/carousel/6.jpg","D:/carousel/7.jpg","D:/carousel/8.jpg","D:/carousel/9.jpg","D:/carousel/10.jpg","D:/carousel/11.jpg"};
    public void setImgLabel(JLabel imgLabel) {
        this.imgLabel = imgLabel;
    }
    @Override
    public void run() {
        int i =0;
        int len =imgs.length-1;
        while (true){
            try {
                File file=new File(imgs[i]);
                InputStream inputStream=new FileInputStream(file);
                byte[] bytes=new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon=new ImageIcon(bytes);
                imgLabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i==len){
                    i=0;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
