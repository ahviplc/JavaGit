package com.lc.thread;

/**
 * @ClassName ThreadSleepDemo
 * @Author lj
 * @Date 2021/1/8 11:48
 * @Version V1.0
 **/
//线程休眠  sleep方法  loop
public class ThreadSleepDemo implements Runnable{

///一个线程正在运行，另一个线程可以调用那个线程对象的interrupt方法中断
    @Override
    public void run() {
        System.out.println("开始进入循环");


        try {
            System.out.println("run此线程休眠2秒");
            Thread.sleep(20000);
            System.out.println("run休眠完成,继续运行");
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("run休眠中断");
            return;
        }

    }

    public static void main(String[] args) {
        ThreadSleepDemo sleepDemo = new ThreadSleepDemo();
        Thread t = new Thread(sleepDemo);
        t.start();


        System.out.println("在main中中断其他线程");
        t.interrupt();
        System.out.println(t.isInterrupted());

        System.out.println("main方法执行完毕，退出。");
    }
}
