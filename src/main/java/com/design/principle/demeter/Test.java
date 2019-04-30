package com.design.principle.demeter;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.demeter
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/30 16:41
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
