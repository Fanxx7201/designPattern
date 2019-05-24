package com.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/23 20:01
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
