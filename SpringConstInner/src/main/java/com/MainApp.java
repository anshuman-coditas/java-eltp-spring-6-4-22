package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringBean.xml");
        Shape shape= (Shape) applicationContext.getBean("shape");
        System.out.println("******METHODS*****");
        System.out.println(applicationContext.containsBean("shape"));
        System.out.println(applicationContext.isSingleton("shape"));
        System.out.println(applicationContext.isPrototype("shape"));
        System.out.println("*******SHAPES IMPLEMENTATION*********");
        shape.display();
    }
}
//Done Constructor arg and Inner Bean in the same Program as well as the methods of beanfactory
//******OUTPUT**********
//        ******METHODS*****
//        true
//        true
//        false
//        *******SHAPES IMPLEMENTATION*********
//        Triangle
//        Point-1 is 1 , 2
//        Point-2 is 3 , 4
//        Point-3 is 5 , 6
//        Circle
//        Radius is 2.3
//        Center is 1 , 2