package com.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/23 19:47
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
