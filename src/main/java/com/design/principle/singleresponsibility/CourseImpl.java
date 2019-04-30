package com.design.principle.singleresponsibility;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.singleresponsibility
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 14:27
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
