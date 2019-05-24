package com.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/23 19:57
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
