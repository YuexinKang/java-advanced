package com.soft1841.jdbc;

import java.sql.*;

/**
 * JDBCq起步练习
 */

public class JDBCDemo1 {
    //JDBC驱动名及数据库连接URL
    static final  String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/db_jdbc";
    //数据库的用户名和密码
    static final String USER="root";
    static final String PASS="root";

    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        //加载JDBC驱动
        Class.forName(JDBC_DRIVER);
        //建立连接
        System.out.println("连接数据库...");
        Connection conn= DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("实例化对象");
        //实例化Staterent对象
        Statement stmt=conn.createStatement();
        //向数据库发送sql语句
        String sql="SELECT * FROM t_student ";
        //执行查询操作
        ResultSet rs=stmt.executeQuery(sql);
        //通过循环查询的结果真
        while (rs.next()){
            //通过字段取值
            int id=rs.getInt("id");
            String name=rs.getString("name");
            int age=rs.getInt("age");
            //输出数据
            System.out.print("ID"+id);
            System.out.print("姓名"+name);
            System.out.print("年龄"+age);
            System.out.println("\n");

        }
        //关闭连接
        rs.close();
        stmt.close();
        conn.close();

    }
}
