package com.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/23 19:42
 * <p>Copyright: Copyright (c) 2019</p>
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
