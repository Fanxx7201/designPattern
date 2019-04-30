package com.design.principle.dependenceinversion;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.dependenceinversion
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/29 16:14
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }
}
