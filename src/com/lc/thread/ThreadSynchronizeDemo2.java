package com.lc.thread;

/**
 * @ClassName ThreadSynchronizeDemo
 * @Author lj
 * @Date 2021/1/8 15:02
 * @Version V1.0
 **/
public class ThreadSynchronizeDemo2 implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {


            while (true){
                synchronized (this){
                    if (ticket>0){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName()+"卖第"+ticket--+"张票");

                    }
                }
            }

    }
    //关于卖票问题，可能出现同步问题，重复卖掉同一张票,根本原因是资源访问不同步引起的
    //同步代码块可以解决这个问题
    //定义方式  synchronize（对象）{}


    public static void main(String[] args) {
        ThreadSynchronizeDemo2 synchronizeDemo = new ThreadSynchronizeDemo2();
        new Thread(synchronizeDemo).start();
        new Thread(synchronizeDemo).start();
        new Thread(synchronizeDemo).start();
        new Thread(synchronizeDemo).start();

    }
}
