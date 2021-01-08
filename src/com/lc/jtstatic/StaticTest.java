package com.lc.jtstatic;

/**
 * @ClassName StaticTest
 * @Author lj
 * @Date 2020/12/2 15:30
 * @Version V1.0
 **/
public class StaticTest {

    private static String S = "try it";

    public static void  testStatic(){
        System.out.println("我是静态方法");
    }

    public static void main(String[] args) {
        System.out.println(StaticTest.S);
        StaticTest.S += ", you can be better";
        System.out.println(StaticTest.S);
        StaticTest.testStatic();
        System.out.println("***********************");
        //输出所有的系统字段，也就是环境信息。 list() 方法将结果发送给它的参数 System.out
        //System.getProperties().list(System.out);
        //C:\Users\theDiyPCOfLJ
        System.out.println(System.getProperties().getProperty("user.home"));
        //theDiyPCOfLJ
        System.out.println(System.getProperty("user.name"));
    }
}
