package com.lc.ennum;

/**
 * @ClassName EnumDemo
 * @Author lj
 * @Date 2020/12/9 16:33
 * @Version V1.0
 **/
public enum EveryDay {
    //一单定义的构造函数，枚举的每个内容/（枚举类型的元素）都得按照set方法定义的来进行声明
    MON("星期一"),TUES("星期2"),WENDS("星期3"),THURS("星期4"),FRI("星期5"),SATUR("星期6"),SUN("星期7");
    private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    EveryDay(String day) {
        this.day = day;
    }


}
