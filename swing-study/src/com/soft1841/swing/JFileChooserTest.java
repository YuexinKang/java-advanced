package com.soft1841.swing;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

/**
 * 文件选择器的测试程序
 */

public class JFileChooserTest extends JFrame implements ActionListener {
    private JButton choseButton;
    private  JLabel pathLable;
    private JFileChooser fileChooser;
    public JFileChooserTest(){
        init();
        setTitle("文件选择器窗体");
        setSize(800,600);
        setLocationRelativeTo(null);
        //窗体大小不可变
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        choseButton=new JButton("选择文件");
        choseButton.addActionListener(this);
        pathLable = new JLabel("暂无选择");
        add(choseButton, BorderLayout.NORTH);
        add(pathLable);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new JFileChooserTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //创建选择器对象
        fileChooser=new JFileChooser();
        //设置文件选择器默认路径
        fileChooser.setCurrentDirectory(new File("D:/"));
        //打开对话框
        int reault=fileChooser.showOpenDialog(null);
        //在控制台输出，看看用户点击按钮时控制台的result值输出情况，判断用户点击的是哪个按钮，
        // 用条件语句，点击确认执行点击取消则什么都不做
        System.out.println(reault);
        //设置用户是否选择了确认按钮
        if (reault==JFileChooser.APPROVE_OPTION){
            //获取用户选择文件
           File file=fileChooser.getSelectedFile();
           pathLable.setText(file.getAbsolutePath());
            try {
                InputStream inputStream=new FileInputStream(file);
                Scanner scanner=new Scanner(inputStream);
                String s=scanner.nextLine();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
