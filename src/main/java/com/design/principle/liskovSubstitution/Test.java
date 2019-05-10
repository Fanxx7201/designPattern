package com.design.principle.liskovSubstitution;

/**
 * @ProjectName: pattern
 * @Package: com.design.principle.liskovSubstitution
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/5 16:02
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class Test {
    /**
     * @Description  调整长和宽
     * @Date  2019/5/5
     * @Param []
     * @return void
     **/
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束: width:" + rectangle.getWidth() + " length:" + rectangle.getLength());
    }

    /*public static void main(String[] args) {
        Rectangle rectangle =  new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }*/

    public static void main(String[] args) {
        //用正方形代替了长方形后, 结果和长方形的结果不一样. 这就不符合里式替换原则. 可以用子类代替父类.
        Square square = new Square();
        //正方形不适用resize方法, 因为正方形和长方形没有继承的关系.
/*        square.setLength(10);
        resize(square);*/
    }
}
