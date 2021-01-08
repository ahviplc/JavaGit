package com.lc.key;

/**
 * @ClassName ThisDemo1
 * @Author lj
 * @Date 2020/12/17 16:57
 * @Version V1.0
 **/
public class ThisDemo3 {

    private String name;
    private int age;

    //不清不楚，到底是形参赋给类属性还是反之
    //public ThisDemo1(String name,int age){
    //    name = name;
    //    age = age;
    //
    //}

    //this使用范例3调用无参构造
    public ThisDemo3(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    public ThisDemo3(){
        System.out.println("无参构造");
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
    boolean compare(ThisDemo3 demo2){
        //this表示当前对象
        if (this.age==demo2.age&&this.name.equals(demo2.name)) {
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        ThisDemo3 xioahua = new ThisDemo3("xioahua", 24);
        //无参构造
        //有参构造
        //ThisDemo1{name='xioahua', age=24}
        System.out.println(xioahua);
    }
}
