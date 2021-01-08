package com.lc.derived;

/**
 * @ClassName Circle
 * @Author lj
 * @Date 2020/12/2 10:35
 * @Version V1.0
 **/
public class Circle extends BaseShape{

    private Trangle trangle;

    @Override
    void doSomething(BaseShape shape) {
        super.doSomething(shape);
    }

    void doSome(){
        //关于修改
        Circle circle = new Circle();
        circle.trangle.term = 24;

    }


}


