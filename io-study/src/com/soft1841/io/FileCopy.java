package com.soft1841.io;

import javax.imageio.IIOException;
import java.io.*;
import java.util.UUID;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File srcFile = new File("D:/BG.jpg");
        String srcFileName = srcFile.getName();
        int position = srcFileName.indexOf(".");
        String suffixName = srcFileName.substring(position+1);
        String newName = UUID.randomUUID().toString();
        //指定目标文件
        File destFile = new File("D:/IO/"+newName+"."+suffixName);
        //创建一个字节数组，大小为源文件大小
        byte[] bytes = new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream in = new FileInputStream(srcFile);
        //将源文件读入字节数组
        in.read(bytes);
        //创建字节输出流
        OutputStream out = new FileOutputStream(destFile);
        //将字节数组通过字节输出流写入目标文件
        out.write(bytes);
        //关闭输入输出流
        in.close();
        out.close();
    }
}
