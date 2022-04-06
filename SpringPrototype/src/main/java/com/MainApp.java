package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Student student= (Student) applicationContext.getBean("student");
        Student student1= (Student) applicationContext.getBean("student");
        student.display();
        System.out.println(student);
        System.out.println(student1);

        //EVERYTIME PROTOTYPE RETURNS NEW INSTANCE
//        ID 123
//        Name Ak
//        com.Student@4470f8a6
//        com.Student@7c83dc97
    }
}
