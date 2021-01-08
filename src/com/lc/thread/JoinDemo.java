package com.lc.thread;

/**
 * @ClassName JoinDemo
 * @Author lj
 * @Date 2020/12/28 14:21
 * @Version V1.0
 **/
//当循环到第五个，完整执行join线程
public class JoinDemo {
    //判断线程是否启动，调用start方法前后，结果不同

    public static void main(String[] args) {
        Join is = new Join();
        Thread pp = new Thread(is);
        int i = 0;
        pp.start();
        for (int i1 = 0; i1 < 10; i1++) {
            if (i==5){
                try {
                    pp.join();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("main Thread"+i++);
        }

    }

}

class Join implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I'm running!"+i);
        }
    }
}
