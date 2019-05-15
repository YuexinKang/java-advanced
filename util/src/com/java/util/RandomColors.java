package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class RandomColors {
    public static void main(String[] args) throws IOException {
        Random random= new Random();
        //生成red
        int redRandom = random.nextInt(256);
        //生成green
        int greenRandom = random.nextInt(256);
        //生成blue
        int buleRandom = random.nextInt(256);
        System.out.println(redRandom + greenRandom + buleRandom);
        BufferedImage bufferedImage = new BufferedImage(120,15,BufferedImage.TYPE_INT_RGB);
        Graphics g =bufferedImage.getGraphics();
        Font font = new Font("微软雅黑",Font.BOLD,16);
        Color color = new Color(redRandom,greenRandom,buleRandom);
        g.setColor(color);
        g.setFont(font);
        g.drawString("验证码",40,15);
        g.fillRect(0,0,120,40);
        g.setColor(color.BLACK);
        File file = new File("D:/code.jpg");
       OutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(bufferedImage,"jpg",outputStream);
        outputStream.close();

    }
}
