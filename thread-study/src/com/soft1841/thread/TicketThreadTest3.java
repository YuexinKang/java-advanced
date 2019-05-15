package com.soft1841.thread;

/**
 * 售票程序3
 * 通过实现Runnable接口并同步线程
 */
public class TicketThreadTest3  extends Thread{
    public static void main(String[] args) {
        TicketThread3 tt=new TicketThread3();
        Thread thread1=new Thread(tt,"南工院");
        thread1.start();
        Thread thread2=new Thread(tt,"南信院");
        thread2.start();
        Thread thread3=new Thread(tt,"南铁院");
        thread3.start();
    }
}
class  TicketThread3 implements Runnable{
private  int tickets=10;
    @Override
    public void run() {
        //同步买票代码块,也就是线程加锁
        synchronized (this){
        while (true){
            if (tickets>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"售票，当前票数"+--tickets);
            }else {
                break;
            }
        }
        }
    }
}
