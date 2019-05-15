package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

/**
 * 随机颜色练习
 * @author 郭瑞昌
 * 2019.03.12
 */
public class RandomColor {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        //生成字母与数字验证码
        String verifyCode = "";//定义字符串变量最后保存生成的验证码
        char c;//定义字符类型保存验证码
        //产生验证码
        for (int i = 1; i<=4;i++){
            int number = random.nextInt(26);
            if (number % 2 ==0){
                //如果生成的随机数是偶数则生成数字
                c = (char) ('0' + (char) ((int)(Math.random() * 10)));
            }else{
                //否则生成字母
                c = (char) ('0' + (char) ((int) (Math.random() * 26)) + 'A');
            }
            //保存验证码
            verifyCode = verifyCode +c;
        }
        //生成redRandom
        //生成greenRandom
        //生成blueRandom
        int redRan = random.nextInt(256);
        int greedRan = random.nextInt(256);
        int blurRan = random.nextInt(256);
        System.out.println("R:  " + redRan + "G:  " + greedRan + "B:  " + blurRan);
        //开始用随即色值绘制图片
        //在图片缓冲区生成一个图片对象
        BufferedImage bufferedImage = new BufferedImage(120, 40, BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色,使用随机生成的颜色
        Color color = new Color(redRan,greedRan,blurRan);
        g.setColor(color);
        //开始绘制,充满图片缓冲区
        g.fillRect(0,0,120,40);
        //绘制文字
        g.setColor(Color.BLACK);
        g.drawString(verifyCode,40,20);
        //输出图片,本地文件的路径
        File file = new File("D:/code.jpg");
        //获取字节输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写出到文件
        ImageIO.write(bufferedImage,"jpg", outputStream);
        //关闭输出流
        outputStream.close();
    }
}