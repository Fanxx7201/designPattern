package com.design.pattern.creational.simplefactory;

/**
 * @ProjectName: pattern
 * @Package: com.design.pattern.creational.simplefactory
 * @Description:
 * @Author: fanxx
 * @CreateDate: 2019/5/20 16:17
 * <p>Copyright: Copyright (c) 2019</p>
 */
public class VideoFactory {
    /*public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
            return null;
    }*/

    //反射实现
    /*public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }*/
}
