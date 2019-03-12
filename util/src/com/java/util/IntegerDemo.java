package com.java.util;

/**
 * Integer类的练习
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 31;
        //屌用Integer类的方法，将num进行进制转换
        String str1 = Integer.toBinaryString(num);
        System.out.println("二进制" + str1);
        String str2 = Integer.toHexString(num);
        System.out.println("十六进制" + str2);
        String str3 = Integer.toOctalString(num);
        System.out.println("八进制" + str3);
        String str4 = Integer.toString(31,7);
        System.out.println("七进制" +str4);
        System.out.println("-----------分割线-----------");
        System.out.println("转换为五进制："+ convert(num,15));
    }
    private static  String convert(int num ,int radix){
        //num转为radix进制
        //创建一个StringBuffer,用来存放结果字符串
        StringBuffer stringBuffer = new StringBuffer();
        //被除数不为0
        while (num !=0){
            //求出余数
            int remainder = num % radix;
            //更新被除数为商
            num= num /radix;
            //将余数加入StringBuffer
            stringBuffer.append(String.valueOf(remainder));
        }
        return stringBuffer.reverse().toString();
    }
}
