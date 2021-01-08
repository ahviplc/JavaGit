package com.lc.derived;

/**
 * @ClassName TestDerived
 * @Author lj
 * @Date 2020/12/2 10:40
 * @Version V1.0
 **/
public class TestDerived {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Trangle trangle = new Trangle();
        circle.doSomething(circle);
        trangle.doSomething(trangle);

    }
}
