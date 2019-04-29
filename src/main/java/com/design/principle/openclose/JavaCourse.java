package com.design.principle.openclose;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.openclose
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/4/28 16:24
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

}
