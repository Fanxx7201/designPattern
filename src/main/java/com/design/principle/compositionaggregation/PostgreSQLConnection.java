package com.design.principle.compositionaggregation;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.compositionaggregation
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/20 14:20
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
