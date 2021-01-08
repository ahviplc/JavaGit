package com.lc.thread;

/**
 * @ClassName BuySome
 * @Author lj
 * @Date 2020/12/29 10:51
 * @Version V1.0
 **/

/**
 * 老爸要小明去买烟
 * 老爸给钱
 * 小明买烟
 */
public class BuySome {

    public static void main(String[] args) {
        //满足老爸要买烟的需求
        new Thread(new Father()).start();
    }
}

class Father implements Runnable{

    @Override
    public void run() {
        System.out.println("老爸给100元让小明去买中华...");

        Thread tt = new Thread(new Son());
        tt.start();
        //需要插队小明去买烟
        try {
            //插队先执行，执行完以后，其他线程接着执行
            tt.join();
        } catch (InterruptedException e) {
            System.out.println("小明不慎走失!报警");
            e.printStackTrace();

        }
        System.out.println("老爸很开心，接过了烟");

        System.out.println("把零钱给小明，小明很开心，蹦跶去了游戏厅");

    }
}


class Son implements Runnable{

    @Override
    public void run() {
        System.out.println("小明接过钱，很开心，要去买烟");
        System.out.println("到达游戏厅，看到好玩的，玩一会：");
        for (int i = 0; i < 10; i++) {
            System.out.println("玩了"+i+"秒");
        }
        System.out.println("赶紧去买烟");
        System.out.println("买烟完成，递给老爸。");
    }
}

