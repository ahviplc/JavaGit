package com.lc.thread;

/**
 * @ClassName SingleThreadDemo1
 * @Author lj
 * @Date 2020/12/28 10:37
 * @Version V1.0
 **/
public class ThreadsDemo {

    public static void main(String[] args) {
        //单线程，按照顺序运行，线程运行完毕，才会走到main线程运行
        //要想实现交替运行，就用到多线程，激活多个线程
        //如何实现多线程？、如何激活线程？
        //线程类是Thread的子类
        //继承实现run方法，线程实现必须编写在run方法内
        new TestThreads().start();
        //循环输出
        for (int i = 0; i < 10; i++) {
            System.out.println("main run");
        }
    }
}

class TestThreads extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("TestThread run");
        }
    }
}
