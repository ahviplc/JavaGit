package com.lc.fin;

import java.util.Arrays;

/**
 * @ClassName FinalDemo
 * @Author lj
 * @Date 2020/12/10 16:11
 * @Version V1.0
 **/
public class FinalDemo {
    //只是引用不变，对于对象引用，final 使引用恒定不变。但是并不意味着不能修改它的值
    private final Character[] characters = {'a','b','c'};


    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        for (int i = 0; i < finalDemo.characters.length; i++) {
            finalDemo.characters[i] = 'c';
        }

        System.out.println(Arrays.toString(finalDemo.characters));
    }

}
