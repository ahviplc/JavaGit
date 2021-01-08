package com.lc.derived;

/**
 * @ClassName BaseShape
 * @Author lj
 * @Date 2020/12/2 10:32
 * @Version V1.0
 **/
public class BaseShape {

  void doSomething(BaseShape shape){
        shape.draw();


        shape.erase();
    }

    private void draw() {
        System.out.println("画布");
    }

    private void erase() {
        System.out.println("消失掉");
    }



    //public static void main(String[] args) {
    //    Circle circle = new Circle();
    //    Trangle trangle = new Trangle();
    //    doSomething(circle);
    //    doSomething(trangle);
    //}
}
