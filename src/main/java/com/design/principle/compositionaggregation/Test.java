package com.design.principle.compositionaggregation;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.compositionaggregation
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/20 14:07
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        //调用set方法, 不同数据库, new不同的实例就可以了.
        productDao.setDbConnection(new MYSQLConnection());
        productDao.addProduct();
    }
}
