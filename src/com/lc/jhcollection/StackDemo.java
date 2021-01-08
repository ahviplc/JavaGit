package com.lc.jhcollection;

import java.util.Stack;

/**
 * @ClassName StackDemo
 * @Author lj
 * @Date 2020/12/24 15:35
 * @Version V1.0
 **/
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("dsds");
        stack.push("sdsd");
        stack.push("tctc");

        //dsds  sdsd tctc

        for (int i = 0; i < 3; i++) {
            System.out.println("出栈"+stack.pop());
        }

    }


}
