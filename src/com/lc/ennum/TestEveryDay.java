package com.lc.ennum;

/**
 * @ClassName TestEveryDay
 * @Author lj
 * @Date 2020/12/25 16:17
 * @Version V1.0
 **/
public class TestEveryDay {

    public static void main(String[] args) {
        //测试实现的接口类型
        for (EveryDay2 value : EveryDay2.values()) {
            System.out.println(value.ordinal()+"---------"+value.name()+"   "+value.getDay());
        }
        //测试println类中定义抽象方法
        for (EveryDayAbstract value : EveryDayAbstract.values()) {
            System.out.println(value.ordinal()+"---------"+value.name()+"   "+value.getDay());
        }
    }
}
