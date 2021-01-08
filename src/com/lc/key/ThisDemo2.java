package com.lc.key;

/**
 * @ClassName ThisDemo1
 * @Author lj
 * @Date 2020/12/17 16:57
 * @Version V1.0
 **/
public class ThisDemo2 {

    private String name;
    private int age;

    //不清不楚，到底是形参赋给类属性还是反之
    //public ThisDemo1(String name,int age){
    //    name = name;
    //    age = age;
    //
    //}

    //this使用范例1
    public ThisDemo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ThisDemo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 比较内容，内容一致则为true
     * @param demo2
     * @return
     */
    boolean compare(ThisDemo2 demo2){
        //this表示当前对象
        if (this.age==demo2.age&&this.name.equals(demo2.name)) {
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        ThisDemo2 xioahua = new ThisDemo2("xioahua", 24);
        ThisDemo2 xiaoyue = new ThisDemo2("xioahua", 24);
        System.out.println("equals"+xiaoyue.equals(xioahua));
        System.out.println("==");
        System.out.println();
        System.out.println(xioahua);
        System.out.println(xiaoyue);
        System.out.println("比较compare");
        //这里this指的是xiaoyue这个对象
        boolean compare = xiaoyue.compare(xioahua);
        System.out.println(compare);
    }
}
