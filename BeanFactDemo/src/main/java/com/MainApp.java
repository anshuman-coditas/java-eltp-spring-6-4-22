package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("Spring.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        Employee employee= (Employee) beanFactory.getBean("emp");
        System.out.println(employee);
        System.out.println(beanFactory.isSingleton("emp"));
        System.out.println(beanFactory.isPrototype("emp"));
        System.out.println(beanFactory.getBean("emp") instanceof Employee);
        List<String> aliases = List.of(beanFactory.getAliases("emp"));
        System.out.println(aliases);
        System.out.println(beanFactory.getBean("emp"));
        System.out.println(beanFactory.getType("emp"));
        System.out.println(beanFactory.isTypeMatch("emp",Employee.class));
    }
}
