package com.design.pattern.creational.factorymethod;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.factorymethod
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/21 15:42
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
