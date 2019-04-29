package com.design.principle.openclose;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.openclose
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/28 16:51
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        //通过接口指定实体类
        ICourse javaCourse = new JavaCourse(96, "课程", 348d);
        System.out.println("课程id:" + javaCourse.getId());
        System.out.println("课程价格: " + javaCourse.getPrice());
    }
}
