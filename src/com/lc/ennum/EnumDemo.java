package com.lc.ennum;

/**
 * @ClassName EnumDemo
 * @Author lj
 * @Date 2020/12/9 16:33
 * @Version V1.0
 **/
public enum  EnumDemo {
    //关于枚举例子，星期，月份，因为都是确定的，星期有七个，月份有12个
    //通过枚举可以限制一个内容的取值范围
    //枚举对相同类型的对象同时声明，调用时不会混淆重复
    //枚举关键字Enum
    ///枚举类型，一般定义如下：enum 枚举名{枚举值表};

    //jdk1.5之后通过定义枚举类来使用枚举类型
    MON,TUES,WENDS,THURS,FRI,SATUR,SUN;


    //jdk1.5之前枚举类型定义
    enum weekDay{MON,TUES,WENDS,THURS,FRI,SATUR,SUN};

    //定义了枚举类型，如何调用呢？
    //声明该类的对象，通过这个对象进行操作


}
