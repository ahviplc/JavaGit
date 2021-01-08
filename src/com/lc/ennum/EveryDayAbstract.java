package com.lc.ennum;

/**
 * @ClassName EnumDemo
 * @Author lj
 * @Date 2020/12/9 16:33
 * @Version V1.0
 **/
public enum EveryDayAbstract{
    //继承某个接口，枚举的每个内容/（枚举类型的元素）都得分别实现接口声明的方法
    FRI{

        public String getDay() {
            return "星期五";
        }
    },
    SATUR{

        public String getDay() {
            return "星期六";
        }
    },
    SUN{

        public String getDay() {
            return "星期日";
        }
    };


    public abstract String getDay();


    }
