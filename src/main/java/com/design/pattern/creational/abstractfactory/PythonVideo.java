package com.design.pattern.creational.abstractfactory;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.abstractfactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/23 20:06
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
