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
public class Boss {
    /**
     * @Description  boss给TeamLeader下指令去查询课程数量
     * 这里的直接的朋友是方法的入参和出参, 方法体内的朋友不是朋友
     * 所以Course不是Boss的朋友, Boss不应该和Course进行交流.
     * @Date  2019/4/30
     * @Param [teamLeader]
     * @return void
     **/
    /*public void commandCheckNumber(TeamLeader teamLeader){
        List<Course> courseList = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courseList);
    }*/
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
