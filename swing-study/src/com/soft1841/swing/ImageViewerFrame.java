package com.soft1841.swing;
/**
 * 卡片布局解决图片查看浏览问题
 */

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ImageViewerFrame extends JFrame implements ActionListener {
    private JButton chooseBtn,preBtn,nextBtn;
    private JFileChooser fileChooser;
    private JPanel centerPanel ,bottomPanel;
    private CardLayout cardLayout;
    public ImageViewerFrame(){
        init();
        setTitle("文件选择器窗体");
        setSize(800,600);
        setLocationRelativeTo(null);
        //窗体大小不可变
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        chooseBtn = new JButton("选择图片");
        add(chooseBtn,BorderLayout.NORTH);
        chooseBtn.addActionListener(this);
        centerPanel=new JPanel();
        cardLayout= new CardLayout();
        centerPanel.setLayout(cardLayout);
        centerPanel.setBackground( new Color(187,225,225));
        add(centerPanel);
        preBtn=new JButton("上一张");
        nextBtn = new JButton("下一张");
        bottomPanel=new JPanel();
        bottomPanel.add(preBtn);
        bottomPanel.add(nextBtn);
        add(bottomPanel,BorderLayout.SOUTH);
        preBtn.addActionListener(this);
        nextBtn.addActionListener(this);

    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new ImageViewerFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==chooseBtn){
            //创建选择器对象
            fileChooser=new JFileChooser();
            //设置文件选择器默认路径
            fileChooser.setCurrentDirectory(new File("D:/img"));
            //设置文件为多选模式
            fileChooser.setMultiSelectionEnabled(true);
            //打开对话框，阻塞模式
            int reault=fileChooser.showOpenDialog(null);
            //设置用户是否选择了确认按钮
            if (reault==JFileChooser.APPROVE_OPTION){
                //获取选中的所有文件，放到文件类型的数组中
                File[] files=fileChooser.getSelectedFiles();
                //遍历文件数组
                for (File f:files) {
                    System.out.println(f.getAbsolutePath());
                    //对每个文件，创建字节输入流读入字节数组，构建icon，并设置给JLable
                    try {
                        byte[] bytes=new byte[(int) f.length()];
                        InputStream inputStream=new FileInputStream(f);
                        inputStream.read(bytes);
                        Icon icon=new ImageIcon(bytes);
                        JLabel imageLable=new JLabel();
                        imageLable.setIcon(icon);
                        centerPanel.add(imageLable);
                    } catch (IOException e1) {
                       JOptionPane.showMessageDialog(null,"IO异常");
                    }
                }
            }
        }
        if (e.getSource()==preBtn){
           cardLayout.previous(centerPanel);

        }
        if (e.getSource()==nextBtn){
           cardLayout.next(centerPanel);

        }
    }
}
