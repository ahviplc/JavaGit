package com.lc.key;

/**
 * @ClassName Application
 * @Author lj
 * @Date 2020/12/17 17:16
 * @Version V1.0
 **/
public class Application {

    public static void main(String[] args) {

        ////test1
        //StaticDemo1 dhsj = new StaticDemo1("dhsj");
        //StaticDemo1 nsd = new StaticDemo1("nsd");
        //System.out.println("我是"+dhsj+"，我来自"+StaticDemo1.city);
        //System.out.println("我是"+nsd+"，我来自"+StaticDemo1.city);
        //StaticDemo1.city = "America";
        //System.out.println("我是"+dhsj+"，我来自"+StaticDemo1.city);
        //System.out.println("我是"+nsd+"，我来自"+StaticDemo1.city);

        ////tset2
        //StaticDemo2 huhu = new StaticDemo2("huhu");
        //StaticDemo2.setCity("france");
        //System.out.println("我是"+huhu+"，我来自"+StaticDemo2.city);

        ////tset3
        //System.out.println("程序开始执行");
        //StaticDemo3 hu = new StaticDemo3("hu");
        //StaticDemo3.setCity("france");
        //System.out.println("我是"+hu+"，我来自"+StaticDemo3.city);

        //test4  编译不通过：Cannot assign a value to final variable 'score'  不能为常量赋值
        //FinalDemo1.score = 101;

        //test7
        //InstanceofDemo instanceofDemo = new InstanceofDemoZi();
        ////若是继承某个类，输出父类方法
        //if (!(instanceofDemo instanceof InstanceofDemo)){
        //    new InstanceofDemo().showName();
        //}else {
        //    instanceofDemo.showName();
        //}



    }

    /////test5
    //不能继承final修饰的类Cannot inherit from final 'com.lc.key.FinalDemo2'
    //class A extends FinalDemo2{
    //
    //}
    ////test6
    //class B extends FinalDemo3{
    //    //无法重写final修饰的show
    //    @Override
    //    public void show2() {
    //        System.out.println("show2 haha");
    //    }
    //}
}
