package com.design.principle.dependenceinversion;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.dependenceinversion
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/29 15:45
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    /**
     * @Description  Geely是属于低层模块, test是属于高层模块.
     * 根据依赖倒置原则: 高层模块不应该依赖低层模块, 二者都应该依赖其抽象
     * 如下的方式, 需要每次在Geely这个类里边做扩展, 是不合适的.
     * @Date  2019/4/29
     * @Param [args]
     * @return void
     **/
    /*public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyFECourse();
    }*/



}
