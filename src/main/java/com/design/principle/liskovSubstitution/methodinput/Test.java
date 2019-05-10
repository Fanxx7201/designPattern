package com.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.liskovSubstitution.methodinput
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/10 17:23
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
