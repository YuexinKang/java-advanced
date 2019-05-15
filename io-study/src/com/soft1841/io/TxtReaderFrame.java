package com.soft1841.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class TxtReaderFrame extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;
    public  TxtReaderFrame(){
        init();
        setTitle("文本阅读程序");
        setSize(640,480);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void init(){
        Font font=new Font("微软雅黑",Font.PLAIN,26);
        inputField = new JTextField(20);
        inputField.setPreferredSize(new Dimension(120,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(100,40));
        //给组件注册监听
        confirmButton.addActionListener(this);
        topPanel =new JPanel();
        //中间的多行文本域
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        add(topPanel, BorderLayout.NORTH);
        contentArea = new JTextArea();
        add(contentArea,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new TxtReaderFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取输入框内容
        String filePath = inputField.getText().trim();
        //创建文件
        File file = new File(filePath);
        //使用三种方法将文件中内容读入
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes =new byte[(int) file.length()];
            //读入内容到字节数组
            inputStream.read(bytes);
            //使用构建一个结果字符串
            String s =new String(bytes);
            //将结果放入文本域
            contentArea.append(s);
            //换行！追加一次回车换行
            contentArea.append("\r\n");


        } catch (IOException e1) {
         System.out.println("IO异常");
        }
    }
}
