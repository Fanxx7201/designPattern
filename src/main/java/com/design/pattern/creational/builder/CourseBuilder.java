package com.design.pattern.creational.builder;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.builder
 * @Description: 抽象的builder
 * @Author: fanxx
 * @CreateDate: 2019/5/28 16:50
 * <p>Copyright: Copyright (c) 2019</p>
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
