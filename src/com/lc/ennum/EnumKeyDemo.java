package com.lc.ennum;

/**
 * @ClassName EnumKeyDemo
 * @Author lj
 * @Date 2020/12/25 14:38
 * @Version V1.0
 **/
public class EnumKeyDemo {
    //相对于枚举类，枚举关键字是定义的一个枚举类型，通过Enum关键字相当于定义一个类并且该类继承枚举类

    public static void main(String[] args) {
        for (EnumDemo value : EnumDemo.values()) {
            System.out.println(value+"------------"+value.ordinal());
        }
        System.out.println();
        //直接通过枚举类获取值更加简单

        EnumDemo fri = EnumDemo.valueOf(EnumDemo.class, "FRI");
        System.out.println(fri);
        System.out.println(EnumDemo.FRI);

    }

}
