package com.design.principle.singleresponsibility;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.singleresponsibility
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 14:14
 * <p>Copyright: Copyright (c) 2019</p>
 */
public interface ICourse {
    /**
     * @Description
     * 这个接口的职责不是单一的. 1是获取课程的信息, 比如名字和视频字节流.
     * 另一个职责是和课程信息无关的.比如退课, 会影响获取课程名字和课程视频字节流的方法.
     * 职责①获取课程信息 ②课程管理
     * @Date  2019/4/30
     * @Param []
     * @return java.lang.String
     **/
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
