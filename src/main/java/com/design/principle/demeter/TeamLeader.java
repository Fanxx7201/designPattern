package com.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.demeter
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 16:35
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class TeamLeader {
    /*public void checkNumberOfCourse(List<Course> courseList){
        System.out.println("在线课程的数量是: " + courseList.size());
    }*/
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是: " + courseList.size());
    }
}
