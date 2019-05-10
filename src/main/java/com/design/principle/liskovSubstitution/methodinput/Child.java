package com.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.liskovSubstitution.methodinput
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/10 16:49
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Child extends Base{
    @Override
    public void method(HashMap map) {
        System.out.println("子类HashMap入参方法被执行....");
    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行....");
    }
}
