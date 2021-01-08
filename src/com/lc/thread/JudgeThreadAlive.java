package com.lc.thread;

/**
 * @ClassName JudgeThreadAlive
 * @Author lj
 * @Date 2020/12/28 11:40
 * @Version V1.0
 **/
public class JudgeThreadAlive {
    //判断线程是否启动，调用start方法前后，结果不同

    public static void main(String[] args) {
        IsAlive is = new IsAlive();
        System.out.println("调用start方法之前"+is.isAlive());
        is.start();
        System.out.println("调用start方法之后"+is.isAlive());

        System.out.println("hello");
        //状态不固定，可能为true可能为false
        System.out.println("main方法结束时"+is.isAlive());

    }

}

class IsAlive extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm running!"+i);
        }
    }
}
