package com.design.principle.dependenceinversion;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.dependenceinversion
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/29 15:40
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Geely {
    private  ICourse iCourse;

    /*public Geely(ICourse iCourse){
        this.iCourse = iCourse;
    }*/
    public void setiCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }

    /*public void studyJavaCourse(){
        System.out.println("Geely在学习java课程");
    }
    public void studyFECourse(){
        System.out.println("Geely在学习前端课程");
    }*/

    //也就是说, Geely在学习课程的时候, 交给高层模块.  而不是交给实现类去编写.
    /*public void studyImoocCourse(ICourse iCourse){
        iCourse.studyCourse();
    }*/

    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
