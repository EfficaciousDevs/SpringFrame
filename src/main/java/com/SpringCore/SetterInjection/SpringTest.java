package com.SpringCore.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        System.out.println( "Welcome to Spring Frameworks!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("Student1");
        Student student2 = (Student) context.getBean("Student2");

        System.out.println(student.hashCode());
        System.out.println(student);
        System.out.println(student2.hashCode());
        System.out.println(student2);

    }
}
