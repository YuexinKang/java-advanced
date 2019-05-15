package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImageFrame extends JFrame {
    private JPanel topPanel;
    private JButton[] buttons;
    private  JLabel imageLable;
    private  JLabel timeLable;
    private  JLabel pathLable;
    private Icon icon;

  public ImageFrame() throws IOException {
      init();
      setTitle("图片窗体");
      setSize(1000,600);
      setLocationRelativeTo(null);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }
  //设置布局放置组件
  public void init() throws IOException {
      topPanel = new JPanel();
      buttons = new JButton[5];
      for (int i = 0 ;i<5;i++){
          buttons[i] =new JButton("按钮"+i+1);
          topPanel.add(buttons[i]);
      }
      add(topPanel, BorderLayout.NORTH);
      imageLable = new JLabel();
      //读入本地的图片到内存的字节数组
      File srcFile = new File("D:/BG.jpg");
      byte[] bytes = new byte[(int) srcFile.length()];
      InputStream in = new FileInputStream(srcFile);
      in.read(bytes);
      icon = new ImageIcon(bytes);
      imageLable.setIcon(icon);
      add(imageLable,BorderLayout.CENTER);
      pathLable = new JLabel(srcFile.getAbsolutePath());
      add(pathLable,BorderLayout.SOUTH);
      String time = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
      timeLable=new JLabel(time);
      add(timeLable,BorderLayout.WEST);




  }
    public static void main(String[] args) throws IOException {
        new ImageFrame();
    }
}
