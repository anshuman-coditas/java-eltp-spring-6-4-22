package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Batch batch= (Batch) applicationContext.getBean("batch");
        batch.display();

    }
}
//
//*****************OUTPUT**************
//        Batch Name Science
//        Batch Code 101
//        Student{s_name='Ak', qualification='MCA', percent=89.55}
//        Student{s_name='Dk', qualification='BCA', percent=79.55}
