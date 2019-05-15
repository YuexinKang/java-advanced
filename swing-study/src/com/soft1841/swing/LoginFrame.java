package com.soft1841.swing;


import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JLabel acccountLabel,passwordLabel,roleLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton comfirButton,cancelButton;
    private JLabel bgLable;
    public LoginFrame(){
        init();
        setTitle("登录窗体");
        setSize(500,480);
        setLocationRelativeTo(null);
        //窗体大小不可变
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    private  void init(){
        Font font = new Font("微软雅黑",Font.PLAIN,18);
        acccountLabel = new JLabel("账号");
        acccountLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel=new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField= new JPasswordField();
        passwordField.setFont(font);
        roleLabel=new JLabel("角色");
        roleLabel.setFont(font);
        String[] roles ={"教师","学生"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setFont(font);
        comfirButton =new JButton("确认");
        comfirButton.setFont(font);
        cancelButton = new JButton("取消");
        cancelButton.setFont(font);
        //窗体布局设置为空布局，需要给每个主键设置定位
        setLayout(null);
        //setBound方法的四个参数分别是组件x,y坐标，组件宽高
        acccountLabel.setBounds(60,60,100,35);
        accountField.setBounds(160,60,260,35);
        passwordLabel.setBounds(60,130,100,35);
        passwordField.setBounds(160,130,260,35);
        roleLabel.setBounds(60,200,100,35);
        roleComboBox.setBounds(160,200,260,35);
        comfirButton.setBounds(80,300,100,40);
        cancelButton.setBounds(280,300,100,40);
        comfirButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        cancelButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        add(acccountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(roleLabel);
        add(roleComboBox);
        add(comfirButton);
        add(cancelButton);
        bgLable =new JLabel();
        Icon bgIcon =new ImageIcon(LoginFrame.class.getResource("/img/bg.jpg"));
        bgLable.setIcon(bgIcon);
        bgLable.setBounds(0,0,640,480);
        add(bgLable);


    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new LoginFrame();

    }
}
