package com.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.liskovSubstitution.methodinput
 * @Description: 作为基类使用
 * @Author: fanxx
 * @CreateDate: 2019/5/10 16:47
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
