package com.lc.ennum;

/**
 * @ClassName EnumUseTest
 * @Author lj
 * @Date 2020/12/25 14:08
 * @Version V1.0
 **/
public class EnumUseTest {
    public static void main(String[] args) {
        EnumDemo satur = EnumDemo.SATUR;
        //获取星期六
        System.out.println(satur);

        //使用switch case

        //jdk1.5之后可以判断枚举类型，做出正确选择
        switch (EnumDemo.SUN) {

            case FRI:
                System.out.println("今天星期五");
                break;
            case MON:
                System.out.println("今天星期一");
            default:
                System.out.println("今天星期N");

        }

        EnumDemo[] values = EnumDemo.values();

        for (EnumDemo value : values) {
            System.out.print(value+" ");

        }
        System.out.println();
        System.out.println("长度为"+values.length);
    }
}
